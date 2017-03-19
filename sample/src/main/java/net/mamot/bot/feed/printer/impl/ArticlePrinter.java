package net.mamot.bot.feed.printer.impl;

import net.mamot.bot.feed.Entry;
import net.mamot.bot.feed.printer.EntryPrinter;

public class ArticlePrinter implements EntryPrinter {

    @Override
    public String print(Entry entry) {
        return entry.getTitle() + "\n" + entry.getLink() + "\n\n" + entry.getContent();
    }
}
