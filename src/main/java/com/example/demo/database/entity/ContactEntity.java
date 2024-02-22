package com.example.demo.database.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class ContactEntity {
@Id
@GeneratedValue
private int id;
private String name;
private String email;
private String subject;
private String message;

}
