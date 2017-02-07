package e2e;

import com.pengrad.telegrambot.commands.AdviceCommand;
import net.mamot.bot.services.impl.AdvicePrinter;
import net.mamot.bot.services.impl.AdviceResource;
import net.mamot.bot.services.impl.MessageFromURL;
import org.junit.Test;

import static com.pengrad.telegrambot.model.request.ParseMode.HTML;
import static com.pengrad.telegrambot.tester.BotTester.*;
import static java.util.Collections.singletonMap;
import static net.mamot.bot.services.Stickers.ALONE;
import static net.mamot.bot.services.Stickers.BLA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AdviceCommandE2E {

    @Test
    public void shouldReturnMessageFromAdviceResource() throws Exception {
        AdviceResource resource = mock(AdviceResource.class);
        when(resource.fetch()).thenReturn(singletonMap("text", "fucking great advice"));

        given(new AdviceCommand(new MessageFromURL(resource, new AdvicePrinter()))).
            got("/advice").
        then().
            shouldAnswer(sticker(BLA.id()),
                         message("fucking great advice").disableWebPagePreview(true).parseMode(HTML));
    }

    @Test
    public void shouldReturnApologize_IfAdviceResourceUnreachable() throws Exception {
        AdviceResource resource = mock(AdviceResource.class);
        when(resource.fetch()).thenThrow(new RuntimeException());

        given(new AdviceCommand(new MessageFromURL(resource, new AdvicePrinter()))).
            got("/advice").
        then().
            shouldAnswer(sticker(ALONE.id()),
                         message("Связь с ноосферой потеряна...").disableWebPagePreview(true).parseMode(HTML));
    }
}