package com.coe.getters.repository;

import com.coe.getters.entities.ContactEntity;
import com.coe.getters.entities.ConversationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<ContactEntity, Integer> {
}