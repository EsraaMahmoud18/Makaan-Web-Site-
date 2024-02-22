package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.database.entity.ContactEntity;
import com.example.demo.database.repository.ContactRepo;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class ContactService {
   private final ContactRepo contactRepo ;
   
   public ContactEntity addNewContact(ContactEntity contactEntity)
   {
	   return contactRepo.save(contactEntity);
   }
   
}
