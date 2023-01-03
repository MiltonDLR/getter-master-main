package com.coe.getters.dto;

import com.coe.getters.entities.ContactEntity;
import com.coe.getters.entities.ConversationEntity;
import com.coe.getters.entities.MessageEntity;
import jakarta.persistence.*;

import java.util.Date;

public class MessageDTO {
    private int messageId;
    private ContactEntity contact;
    private String messageText;
    private Date sentDatetime;
    private ConversationEntity conversation;

    public MessageDTO(MessageEntity entity) {
        this.messageId = entity.getMessageId();
        this.contact = entity.getContact();
        this.messageText = entity.getMessageText();
        this.sentDatetime = entity.getSentDatetime();
        this.conversation = entity.getConversation();
    }


    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public ContactEntity getContact() {
        return contact;
    }

    public void setContact(ContactEntity contact) {
        this.contact = contact;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Date getSentDatetime() {
        return sentDatetime;
    }

    public void setSentDatetime(Date sentDatetime) {
        this.sentDatetime = sentDatetime;
    }

    public ConversationEntity getConversation() {
        return conversation;
    }

    public void setConversation(ConversationEntity conversation) {
        this.conversation = conversation;
    }
}
