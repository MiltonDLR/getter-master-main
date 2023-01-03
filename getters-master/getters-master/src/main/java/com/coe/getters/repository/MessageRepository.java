package com.coe.getters.repository;

import com.coe.getters.dto.ContactDTO;
import com.coe.getters.dto.MessageDTO;
import com.coe.getters.entities.ContactEntity;
import com.coe.getters.entities.GroupMemberEntity;
import com.coe.getters.entities.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<MessageEntity, Integer> {
    List<MessageEntity> getMessageEntitiesByConversation_ConversationId(int conversationId);

}
