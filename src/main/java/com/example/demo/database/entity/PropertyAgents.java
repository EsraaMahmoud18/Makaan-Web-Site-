package com.example.demo.database.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class PropertyAgents {
@Id	
private String name;
private String imgURL;
private String desc;
}
