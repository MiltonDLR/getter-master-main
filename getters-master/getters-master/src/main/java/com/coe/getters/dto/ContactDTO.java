package com.coe.getters.dto;

import com.coe.getters.entities.ContactEntity;
import com.coe.getters.entities.GroupMemberEntity;
import com.coe.getters.entities.MessageEntity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Set;

public class ContactDTO  {
    public ContactDTO(int contactId, String firstName, String lastName, byte[] profilePhoto, long phoneNumber, String status, Set<GroupMemberEntity> groupMemberSet, Set<MessageEntity> messageEntitySet) {
        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.profilePhoto = profilePhoto;
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.groupMemberSet = groupMemberSet;
        this.messageEntitySet = messageEntitySet;
    }

    private int contactId;


    private String firstName;


    private String lastName;


    private byte[] profilePhoto;


    private long phoneNumber;


    private String status;


    private Set<GroupMemberEntity> groupMemberSet;


    private Set<MessageEntity> messageEntitySet;

    public ContactDTO(ContactEntity entity) {
        this.contactId = entity.getContactId();
        this.firstName = entity.getFirstName();
        this.lastName = entity.getLastName();
        this.profilePhoto = entity.getProfilePhoto();
        this.phoneNumber = entity.getPhoneNumber();
        this.status = entity.getStatus();
        this.groupMemberSet = entity.getGroupMemberSet();
        this.messageEntitySet = entity.getMessageEntitySet() ;
    }

    public ContactDTO(MessageEntity messageEntity) {

    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte[] getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(byte[] profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<GroupMemberEntity> getGroupMemberSet() {
        return groupMemberSet;
    }

    public void setGroupMemberSet(Set<GroupMemberEntity> groupMemberSet) {
        this.groupMemberSet = groupMemberSet;
    }

    public Set<MessageEntity> getMessageEntitySet() {
        return messageEntitySet;
    }

    public void setMessageEntitySet(Set<MessageEntity> messageEntitySet) {
        this.messageEntitySet = messageEntitySet;
    }

    @Override
    public String toString() {
        return "ContactDTO{" +
                "contactId=" + contactId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", profilePhoto=" + Arrays.toString(profilePhoto) +
                ", phoneNumber=" + phoneNumber +
                ", status='" + status + '\'' +
                ", groupMemberSet=" + groupMemberSet +
                ", messageEntitySet=" + messageEntitySet +
                '}';
    }
}
