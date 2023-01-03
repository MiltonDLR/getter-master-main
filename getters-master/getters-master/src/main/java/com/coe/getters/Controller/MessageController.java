package com.coe.getters.Controller;


import com.coe.getters.dto.ContactDTO;
import com.coe.getters.dto.MessageDTO;
import com.coe.getters.entities.ContactEntity;
import com.coe.getters.entities.MessageEntity;
import com.coe.getters.repository.MessageRepository;
import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/message")
@CrossOrigin
public class MessageController {
    @Autowired
    private MessageRepository messageRepository;

    @GetMapping("/{messageId}")
    public MessageDTO getMessageBYId(@PathVariable("messageId") int messageId){
        if (messageId <= 0){
            return null;
        }
        MessageEntity messageEntity = messageRepository.findById(messageId).orElse(null);
        if (messageEntity != null) {
            return new MessageDTO(messageEntity);
        }
        return null;
    }

    @GetMapping("")
    public List<MessageDTO> getMessages(){
        List<MessageDTO> messageDTOList = new ArrayList<>();
        List<MessageEntity> messageEntities = messageRepository.findAll();
        for (MessageEntity entity: messageEntities
        ) {
            messageDTOList.add(new MessageDTO(entity));
        }
        return messageDTOList;
    }

    @GetMapping("/conversation/{conversationId}")
    public List<MessageDTO> getMessageByConversation(@PathVariable("conversationId")int conversationId){
        List<MessageDTO> dtos = new ArrayList<>();
        List<MessageEntity> messageEntities = messageRepository.
                getMessageEntitiesByConversation_ConversationId(conversationId);

        for (MessageEntity entity: messageEntities
             ) {
            dtos.add(new MessageDTO(entity));
        }

        return dtos;
    }
}
