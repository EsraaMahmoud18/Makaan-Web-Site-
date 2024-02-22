package com.example.demo.database.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class PropertyTypeEntity {
	// Apartment,Villa,Home,Office,Building,TownHouse,Shop,Garage
	@Id
	@GeneratedValue
	private int id;
	private String img;
	private String name;
	private int numbersOfProperties;
	
	
}
