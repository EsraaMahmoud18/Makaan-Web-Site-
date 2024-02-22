package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.database.entity.PropertyAgents;
import com.example.demo.database.repository.PropertyAgentsRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PropertyAgentsService {
 private final PropertyAgentsRepo propertyAgentsRepo;
 
 public List<PropertyAgents> getAll()
 {
	 return propertyAgentsRepo.findAll();
 }
}
