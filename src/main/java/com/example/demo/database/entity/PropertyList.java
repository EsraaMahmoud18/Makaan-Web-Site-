package com.example.demo.database.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class PropertyList {
  @Id
  @GeneratedValue
  private int id;
  private double price;
  private String name;
  private String address;
  private boolean flag;
  private String img;
  private double area;
  private int numOfBeds;
  private int numOfRooms;
  private String propertyType;
  
}
