package com.coe.getters.Controller;

import com.coe.getters.dto.ContactDTO;
import com.coe.getters.dto.GroupMemberDTO;
import com.coe.getters.entities.ContactEntity;
import com.coe.getters.entities.ConversationEntity;
import com.coe.getters.entities.GroupMemberEntity;
import com.coe.getters.repository.GroupMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/group-member")
@CrossOrigin
public class GroupMemberController {
    @Autowired
    private GroupMemberRepository groupMemberRepository;

    @GetMapping("/{groupMemberId}")
    public GroupMemberDTO getGroupMemberBYId(@PathVariable("groupMemberId") int groupMemberId) {
        if (groupMemberId <= 0) {
            return null;
        }
        GroupMemberEntity groupMemberEntity = groupMemberRepository.findById(groupMemberId).orElse(null);
        if (groupMemberEntity != null) {
            return new GroupMemberDTO(groupMemberEntity);
        }
        return null;
    }

    @GetMapping("")
    public List<GroupMemberDTO> getGroupMember() {
        List<GroupMemberDTO> groupMemberDTOList = new ArrayList<>();
        List<GroupMemberEntity> groupMemberEntities = groupMemberRepository.findAll();
        for (GroupMemberEntity entity : groupMemberEntities
        ) {
            groupMemberDTOList.add(new GroupMemberDTO(entity));
        }
        return groupMemberDTOList;
    }

    @GetMapping("/contact/{idContact}")
    public List<GroupMemberDTO> getGroupMemberByContact(@PathVariable("idContact") int idContact) {
        List<GroupMemberDTO> dtos = new ArrayList<>();
        List<GroupMemberEntity> groupMemberEntities = groupMemberRepository.
                getGroupMemberEntitiesByContact_ContactId(idContact);

        for (GroupMemberEntity entity : groupMemberEntities
        ) {
            dtos.add(new GroupMemberDTO(entity));
        }

        return dtos;
    }

    @GetMapping("/conversation/{idConversation}")
    public List<GroupMemberDTO> getGroupMemberByConversation(@PathVariable("idConversation") int idConversation) {
        List<GroupMemberDTO> dtos = new ArrayList<>();
        List<GroupMemberEntity> entities = groupMemberRepository.
                getGroupMemberEntitiesByConversation_ConversationId(idConversation);

        for (GroupMemberEntity entity : entities
        ) {
            dtos.add(new GroupMemberDTO(entity));
        }

        return dtos;
    }

    @GetMapping("/conversation/exists/{idContactCreator}/{idContactMember}")
    public Integer existConversationWithContact(@PathVariable("idContactCreator") int idContactCreator,
                                                @PathVariable("idContactMember") int idContactMember) {
        return groupMemberRepository.conversationBetweenContactsExists(idContactCreator, idContactMember);
    }
}
