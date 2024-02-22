package com.example.demo.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.database.entity.MainEntity;

public interface MainRepo extends JpaRepository<MainEntity, Integer> {

}
