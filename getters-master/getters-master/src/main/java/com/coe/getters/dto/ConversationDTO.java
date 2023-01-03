package com.coe.getters.dto;

import com.coe.getters.entities.ConversationEntity;
import com.coe.getters.entities.GroupMemberEntity;
import com.coe.getters.entities.MessageEntity;
import jakarta.persistence.*;

import java.util.Set;

public class ConversationDTO {

    private int conversationId;
    private String conversationName;
    private Set<GroupMemberEntity> groupMemberSet;
    private Set<MessageEntity> messages;



    public ConversationDTO(ConversationEntity conversationEntity) {
        this.conversationId = conversationEntity.getConversationId();
        this.conversationName = conversationEntity.getConversationName();
        this.groupMemberSet = conversationEntity.getGroupMemberSet();
        this.messages = conversationEntity.getMessages();

    }

    public int getConversationId() {
        return conversationId;
    }

    public void setConversationId(int conversationId) {
        this.conversationId = conversationId;
    }

    public String getConversationName() {
        return conversationName;
    }

    public void setConversationName(String conversationName) {
        this.conversationName = conversationName;
    }

    public Set<GroupMemberEntity> getGroupMemberSet() {
        return groupMemberSet;
    }

    public void setGroupMemberSet(Set<GroupMemberEntity> groupMemberSet) {
        this.groupMemberSet = groupMemberSet;
    }

    public Set<MessageEntity> getMessages() {
        return messages;
    }

    public void setMessages(Set<MessageEntity> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "ConversationDTO{" +
                "conversationId=" + conversationId +
                ", conversationName='" + conversationName + '\'' +
                ", groupMemberSet=" + groupMemberSet +
                ", messages=" + messages +
                '}';
    }
}
