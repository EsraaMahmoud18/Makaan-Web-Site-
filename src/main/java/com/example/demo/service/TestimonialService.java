package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.database.entity.PropertyList;
import com.example.demo.database.entity.TestimonialEntity;
import com.example.demo.database.repository.TestimonialRepo;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Service
public class TestimonialService {
private final TestimonialRepo testimonialRepo;
public List<TestimonialEntity> getAll() {
	return testimonialRepo.findAll();
}
public void addNewOpionion(TestimonialEntity testimonialEntity)
{
	  testimonialRepo.save(testimonialEntity);
} 
}
