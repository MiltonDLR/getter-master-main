package com.coe.getters.Controller;


import com.coe.getters.dto.ContactDTO;
import com.coe.getters.entities.ContactEntity;
import com.coe.getters.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/contact")
@CrossOrigin
public class ContactController {

    @Autowired
    private ContactRepository repository;

    @GetMapping("/{contactId}")
    public ContactDTO getContactBYId(@PathVariable("contactId") int contactId){
        if (contactId <= 0){
            return null;
        }
        ContactEntity contactEntity = repository.findById(contactId).orElse(null);
        if (contactEntity != null) {
            return new ContactDTO(contactEntity);
        }
        return null;
    }

    @GetMapping("")
    public List<ContactDTO> getContacts(){
        List<ContactDTO> contactDTOList = new ArrayList<>();
        List<ContactEntity> contactEntities = repository.findAll();
        for (ContactEntity entity: contactEntities
             ) {
            contactDTOList.add(new ContactDTO(entity));
        }
        return contactDTOList;
    }

}
