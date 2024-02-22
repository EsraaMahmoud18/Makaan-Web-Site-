package com.example.demo.database.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class TestimonialEntity {
@Id
@GeneratedValue
private int id;
private String desc;
private String imgURL;
private String name;
private String job;
}
