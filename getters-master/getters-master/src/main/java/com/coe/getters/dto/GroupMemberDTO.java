package com.coe.getters.dto;

import com.coe.getters.entities.ContactEntity;
import com.coe.getters.entities.ConversationEntity;
import com.coe.getters.entities.GroupMemberEntity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

public class GroupMemberDTO  implements  Serializable{

    private int groupMemberId;
    private ContactEntity contact;
    private ConversationEntity conversation;
    private Date joinedDatetime;
    private Date leftDatetime;



    public GroupMemberDTO(GroupMemberEntity groupMemberEntity) {
        this.groupMemberId = groupMemberEntity.getGroupMemberId();
        this.contact = groupMemberEntity.getContact();
        this.conversation = groupMemberEntity.getConversation();
        this.joinedDatetime = groupMemberEntity.getJoinedDatetime();
        this.leftDatetime = groupMemberEntity.getLeftDatetime();
    }

    public int getGroupMemberId() {
        return groupMemberId;
    }

    public void setGroupMemberId(int groupMemberId) {
        this.groupMemberId = groupMemberId;
    }

    public ContactEntity getContact() {
        return contact;
    }

    public void setContact(ContactEntity contact) {
        this.contact = contact;
    }

    public ConversationEntity getConversation() {
        return conversation;
    }

    public void setConversation(ConversationEntity conversation) {
        this.conversation = conversation;
    }

    public Date getJoinedDatetime() {
        return joinedDatetime;
    }

    public void setJoinedDatetime(Date joinedDatetime) {
        this.joinedDatetime = joinedDatetime;
    }

    public Date getLeftDatetime() {
        return leftDatetime;
    }

    public void setLeftDatetime(Date leftDatetime) {
        this.leftDatetime = leftDatetime;
    }

    @Override
    public String toString() {
        return "GroupMemberDTO{" +
                "groupMemberId=" + groupMemberId +
                ", contact=" + contact +
                ", conversation=" + conversation +
                ", joinedDatetime=" + joinedDatetime +
                ", leftDatetime=" + leftDatetime +
                '}';
    }
}
