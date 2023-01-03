package com.coe.getters.Controller;

import com.coe.getters.dto.ContactDTO;
import com.coe.getters.dto.ConversationDTO;
import com.coe.getters.entities.ContactEntity;
import com.coe.getters.entities.ConversationEntity;
import com.coe.getters.repository.ConversationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/conversation")
@CrossOrigin
public class ConversationController {
    @Autowired
    private ConversationRepository conversationRepository;

    @GetMapping("/{conversationId}")
    public ConversationDTO getConversationById(@PathVariable("conversationId") int conversationId){
        if (conversationId <= 0){
            return  null;
        }
        ConversationEntity conversationEntity = conversationRepository.findById(conversationId).orElse(null);
        if (conversationEntity != null){
            return new ConversationDTO(conversationEntity);
        }
        return null;
    }

    @GetMapping("")
    public List<ConversationDTO> getConversation(){
        List<ConversationDTO> conversationDTOList = new ArrayList<>();
        List<ConversationEntity> conversationEntities = conversationRepository.findAll();
        for (ConversationEntity entity: conversationEntities
        ) {
            conversationDTOList.add(new ConversationDTO(entity));
        }
        return conversationDTOList;
    }
}
