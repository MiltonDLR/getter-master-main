package com.coe.getters.repository;

import com.coe.getters.entities.GroupMemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupMemberRepository extends JpaRepository<GroupMemberEntity, Integer> {
    List<GroupMemberEntity> getGroupMemberEntitiesByContact_ContactId(int contactId);
    List<GroupMemberEntity> getGroupMemberEntitiesByConversation_ConversationId(int conversationId);

    @Procedure(procedureName = "sp_conversationBetweenContactsExists")
    Integer conversationBetweenContactsExists(int contactCreator, int contactMember);
}
