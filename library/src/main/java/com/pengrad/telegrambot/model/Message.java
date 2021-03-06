package com.pengrad.telegrambot.model;

import java.util.Arrays;

import static java.util.Arrays.copyOf;

/**
 * stas
 * 8/4/15.
 */
public class Message {

    private Integer message_id;
    private User from;
    private Integer date;
    private Chat chat;
    private User forward_from;
    private Chat forward_from_chat;
    private Integer forward_from_message_id;
    private Integer forward_date;
    private Message reply_to_message;
    private Integer edit_date;
    private String text;
    private MessageEntity[] entities;
    private Audio audio;
    private Document document;
    private Game game;
    private PhotoSize[] photo;
    private Sticker sticker;
    private Video video;
    private Voice voice;
    private String caption;
    private Contact contact;
    private Location location;
    private Venue venue;
    private User new_chat_member;
    private User left_chat_member;
    private String new_chat_title;
    private PhotoSize[] new_chat_photo;
    private Boolean delete_chat_photo;
    private Boolean group_chat_created;
    private Boolean supergroup_chat_created;
    private Boolean channel_chat_created;
    private Long migrate_to_chat_id;
    private Long migrate_from_chat_id;
    private Message pinned_message;

    public void setMessage_id(Integer message_id) {
        this.message_id = message_id;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public void setForward_from(User forward_from) {
        this.forward_from = forward_from;
    }

    public void setForward_from_chat(Chat forward_from_chat) {
        this.forward_from_chat = forward_from_chat;
    }

    public void setForward_from_message_id(Integer forward_from_message_id) {
        this.forward_from_message_id = forward_from_message_id;
    }

    public void setForward_date(Integer forward_date) {
        this.forward_date = forward_date;
    }

    public void setReply_to_message(Message reply_to_message) {
        this.reply_to_message = reply_to_message;
    }

    public void setEdit_date(Integer edit_date) {
        this.edit_date = edit_date;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setEntities(MessageEntity[] entities) {
        this.entities = copyOf(entities, entities.length);
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void setPhoto(PhotoSize[] photo) {
        this.photo = copyOf(photo, photo.length);
    }

    public void setSticker(Sticker sticker) {
        this.sticker = sticker;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public void setVoice(Voice voice) {
        this.voice = voice;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public void setNew_chat_member(User new_chat_member) {
        this.new_chat_member = new_chat_member;
    }

    public void setLeft_chat_member(User left_chat_member) {
        this.left_chat_member = left_chat_member;
    }

    public void setNew_chat_title(String new_chat_title) {
        this.new_chat_title = new_chat_title;
    }

    public void setNew_chat_photo(PhotoSize[] new_chat_photo) {
        this.new_chat_photo = copyOf(new_chat_photo, new_chat_photo.length);
    }

    public void setDelete_chat_photo(Boolean delete_chat_photo) {
        this.delete_chat_photo = delete_chat_photo;
    }

    public void setGroup_chat_created(Boolean group_chat_created) {
        this.group_chat_created = group_chat_created;
    }

    public void setSupergroup_chat_created(Boolean supergroup_chat_created) {
        this.supergroup_chat_created = supergroup_chat_created;
    }

    public void setChannel_chat_created(Boolean channel_chat_created) {
        this.channel_chat_created = channel_chat_created;
    }

    public void setMigrate_to_chat_id(Long migrate_to_chat_id) {
        this.migrate_to_chat_id = migrate_to_chat_id;
    }

    public void setMigrate_from_chat_id(Long migrate_from_chat_id) {
        this.migrate_from_chat_id = migrate_from_chat_id;
    }

    public void setPinned_message(Message pinned_message) {
        this.pinned_message = pinned_message;
    }

    public Integer messageId() {
        return message_id;
    }

    public User from() {
        return from;
    }

    public Integer date() {
        return date;
    }

    public Chat chat() {
        return chat;
    }

    public User forwardFrom() {
        return forward_from;
    }

    public Chat forwardFromChat() {
        return forward_from_chat;
    }

    public Integer forwardFromMessageId() {
        return forward_from_message_id;
    }

    public Integer forwardDate() {
        return forward_date;
    }

    public Message replyToMessage() {
        return reply_to_message;
    }

    public Integer editDate() {
        return edit_date;
    }

    public String text() {
        return text;
    }

    public MessageEntity[] entities() {
        return entities;
    }

    public Audio audio() {
        return audio;
    }

    public Document document() {
        return document;
    }

    public Game game() {
        return game;
    }

    public PhotoSize[] photo() {
        return photo;
    }

    public Sticker sticker() {
        return sticker;
    }

    public Video video() {
        return video;
    }

    public Voice voice() {
        return voice;
    }

    public String caption() {
        return caption;
    }

    public Contact contact() {
        return contact;
    }

    public Location location() {
        return location;
    }

    public Venue venue() {
        return venue;
    }

    public User newChatMember() {
        return new_chat_member;
    }

    public User leftChatMember() {
        return left_chat_member;
    }

    public String newChatTitle() {
        return new_chat_title;
    }

    public PhotoSize[] newChatPhoto() {
        return new_chat_photo;
    }

    public Boolean deleteChatPhoto() {
        return delete_chat_photo;
    }

    public Boolean groupChatCreated() {
        return group_chat_created;
    }

    public Boolean supergroupChatCreated() {
        return supergroup_chat_created;
    }

    public Boolean channelChatCreated() {
        return channel_chat_created;
    }

    public Long migrateToChatId() {
        return migrate_to_chat_id;
    }

    public Long migrateFromChatId() {
        return migrate_from_chat_id;
    }

    public Message pinnedMessage() {
        return pinned_message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message = (Message) o;

        if (message_id != null ? !message_id.equals(message.message_id) : message.message_id != null) return false;
        if (from != null ? !from.equals(message.from) : message.from != null) return false;
        if (date != null ? !date.equals(message.date) : message.date != null) return false;
        if (chat != null ? !chat.equals(message.chat) : message.chat != null) return false;
        if (forward_from != null ? !forward_from.equals(message.forward_from) : message.forward_from != null)
            return false;
        if (forward_from_chat != null ? !forward_from_chat.equals(message.forward_from_chat) : message.forward_from_chat != null)
            return false;
        if (forward_from_message_id != null ? !forward_from_message_id.equals(message.forward_from_message_id) : message.forward_from_message_id != null)
            return false;
        if (forward_date != null ? !forward_date.equals(message.forward_date) : message.forward_date != null)
            return false;
        if (reply_to_message != null ? !reply_to_message.equals(message.reply_to_message) : message.reply_to_message != null)
            return false;
        if (edit_date != null ? !edit_date.equals(message.edit_date) : message.edit_date != null) return false;
        if (text != null ? !text.equals(message.text) : message.text != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(entities, message.entities)) return false;
        if (audio != null ? !audio.equals(message.audio) : message.audio != null) return false;
        if (document != null ? !document.equals(message.document) : message.document != null) return false;
        if (game != null ? !game.equals(message.game) : message.game != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(photo, message.photo)) return false;
        if (sticker != null ? !sticker.equals(message.sticker) : message.sticker != null) return false;
        if (video != null ? !video.equals(message.video) : message.video != null) return false;
        if (voice != null ? !voice.equals(message.voice) : message.voice != null) return false;
        if (caption != null ? !caption.equals(message.caption) : message.caption != null) return false;
        if (contact != null ? !contact.equals(message.contact) : message.contact != null) return false;
        if (location != null ? !location.equals(message.location) : message.location != null) return false;
        if (venue != null ? !venue.equals(message.venue) : message.venue != null) return false;
        if (new_chat_member != null ? !new_chat_member.equals(message.new_chat_member) : message.new_chat_member != null)
            return false;
        if (left_chat_member != null ? !left_chat_member.equals(message.left_chat_member) : message.left_chat_member != null)
            return false;
        if (new_chat_title != null ? !new_chat_title.equals(message.new_chat_title) : message.new_chat_title != null)
            return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(new_chat_photo, message.new_chat_photo)) return false;
        if (delete_chat_photo != null ? !delete_chat_photo.equals(message.delete_chat_photo) : message.delete_chat_photo != null)
            return false;
        if (group_chat_created != null ? !group_chat_created.equals(message.group_chat_created) : message.group_chat_created != null)
            return false;
        if (supergroup_chat_created != null ? !supergroup_chat_created.equals(message.supergroup_chat_created) : message.supergroup_chat_created != null)
            return false;
        if (channel_chat_created != null ? !channel_chat_created.equals(message.channel_chat_created) : message.channel_chat_created != null)
            return false;
        if (migrate_to_chat_id != null ? !migrate_to_chat_id.equals(message.migrate_to_chat_id) : message.migrate_to_chat_id != null)
            return false;
        if (migrate_from_chat_id != null ? !migrate_from_chat_id.equals(message.migrate_from_chat_id) : message.migrate_from_chat_id != null)
            return false;
        return pinned_message != null ? pinned_message.equals(message.pinned_message) : message.pinned_message == null;

    }

    @Override
    public int hashCode() {
        return message_id != null ? message_id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message_id=" + message_id +
                ", from=" + from +
                ", date=" + date +
                ", chat=" + chat +
                ", forward_from=" + forward_from +
                ", forward_from_chat=" + forward_from_chat +
                ", forward_from_message_id=" + forward_from_message_id +
                ", forward_date=" + forward_date +
                ", reply_to_message=" + reply_to_message +
                ", edit_date=" + edit_date +
                ", text='" + text + '\'' +
                ", entities=" + Arrays.toString(entities) +
                ", audio=" + audio +
                ", document=" + document +
                ", game=" + game +
                ", photo=" + Arrays.toString(photo) +
                ", sticker=" + sticker +
                ", video=" + video +
                ", voice=" + voice +
                ", caption='" + caption + '\'' +
                ", contact=" + contact +
                ", location=" + location +
                ", venue=" + venue +
                ", new_chat_member=" + new_chat_member +
                ", left_chat_member=" + left_chat_member +
                ", new_chat_title='" + new_chat_title + '\'' +
                ", new_chat_photo=" + Arrays.toString(new_chat_photo) +
                ", delete_chat_photo=" + delete_chat_photo +
                ", group_chat_created=" + group_chat_created +
                ", supergroup_chat_created=" + supergroup_chat_created +
                ", channel_chat_created=" + channel_chat_created +
                ", migrate_to_chat_id=" + migrate_to_chat_id +
                ", migrate_from_chat_id=" + migrate_from_chat_id +
                ", pinned_message=" + pinned_message +
                '}';
    }
}
