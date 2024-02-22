package com.example.demo.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.database.entity.PropertyList;

public interface PropertyListRepo  extends JpaRepository<PropertyList, Integer>{

}
