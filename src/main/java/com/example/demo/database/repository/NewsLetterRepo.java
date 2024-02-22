package com.example.demo.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.database.entity.NewsLetterEntity;

public interface NewsLetterRepo extends JpaRepository<NewsLetterEntity, Integer> {

}
