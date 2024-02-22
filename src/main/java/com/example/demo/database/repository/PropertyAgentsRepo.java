package com.example.demo.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.database.entity.PropertyAgents;

public interface PropertyAgentsRepo extends JpaRepository<PropertyAgents, String> {

}
