package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.database.entity.PropertyList;
import com.example.demo.database.repository.PropertyListRepo;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Service
public class PropertyListService {
  private final PropertyListRepo propertyListRepo;
  public List<PropertyList> getAll()
  {
	  return propertyListRepo.findAll();
  }
  public PropertyList getById(int id)
  {
	  return propertyListRepo.findById(id).get();
  }
  public void addNewProperty(PropertyList propertyList)
  {
	  propertyListRepo.save(propertyList);
  }
  
}
