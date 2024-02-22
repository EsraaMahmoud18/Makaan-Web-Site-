package com.example.demo.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.database.entity.TestimonialEntity;

public interface TestimonialRepo extends JpaRepository<TestimonialEntity, Integer>{

}
