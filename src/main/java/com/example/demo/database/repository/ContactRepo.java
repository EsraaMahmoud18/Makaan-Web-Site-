package com.example.demo.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.database.entity.ContactEntity;

public interface ContactRepo extends JpaRepository<ContactEntity, Integer> {

}
