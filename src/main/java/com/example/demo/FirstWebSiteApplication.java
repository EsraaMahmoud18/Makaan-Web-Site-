package com.example.demo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.database.entity.PropertyAgents;
import com.example.demo.database.entity.PropertyList;
import com.example.demo.database.entity.TestimonialEntity;
import com.example.demo.database.repository.PropertyAgentsRepo;
import com.example.demo.database.repository.PropertyListRepo;
import com.example.demo.database.repository.TestimonialRepo;


@SpringBootApplication
public class FirstWebSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstWebSiteApplication.class, args);
	}
	@Bean
	CommandLineRunner init(PropertyListRepo pr,PropertyAgentsRepo pA,TestimonialRepo tp)
	{
		return args->
		{
			PropertyList p = new PropertyList();
			p.setName("Golden Urban House For Sell");
			p.setPrice(12.345);
			p.setImg("http://localhost:8080/img/property-1.jpg");
			p.setAddress("123 Street, New York, USA");
			p.setFlag(true);
			p.setArea(1000);
			p.setPropertyType("Appartment");
			p.setNumOfBeds(3);
			p.setNumOfRooms(2);
			pr.save(p);
			PropertyList p1 = new PropertyList();
			p1.setName("Amirecan House");
			p1.setPrice(12.345);
			p1.setImg("http://localhost:8080/img/property-2.jpg");
			p1.setAddress("123 Street, New York, USA");
			p1.setFlag(true);
			p1.setArea(1000);
			p1.setPropertyType("Appartment");
			p1.setNumOfBeds(3);
			p1.setNumOfRooms(2);
			pr.save(p1);
			PropertyList p3 = new PropertyList();
			p3.setName("Amirecan House");
			p3.setPrice(12.345);
			p3.setImg("http://localhost:8080/img/property-3.jpg");
			p3.setAddress("123 Street, New York, USA");
			p3.setFlag(true);
			p3.setArea(1000);
			p3.setPropertyType("Appartment");
			p3.setNumOfBeds(3);
			p3.setNumOfRooms(2);
			pr.save(p3);
			
			
			
			
			PropertyAgents propertyAgent = new PropertyAgents();
			propertyAgent.setName("yasmeen ali");
			propertyAgent.setImgURL("http://localhost:8080/img/team-1.jpg");
			propertyAgent.setDesc("Doctor");
			pA.save(propertyAgent);
			PropertyAgents propertyAgent2 = new PropertyAgents();
			propertyAgent2.setName("mahmoud Ahmed");
			propertyAgent2.setImgURL("http://localhost:8080/img/team-2.jpg");
			propertyAgent2.setDesc("Engineer");
			pA.save(propertyAgent2);
			PropertyAgents propertyAgent3 = new PropertyAgents();
			propertyAgent3.setName("jumana farook");
			propertyAgent3.setImgURL("http://localhost:8080/img/team-3.jpg");
			propertyAgent3.setDesc("Doctor");
			pA.save(propertyAgent3);
			PropertyAgents propertyAgent4 = new PropertyAgents();
			propertyAgent4.setName("Ali Saad");
			propertyAgent4.setImgURL("http://localhost:8080/img/team-4.jpg");
			propertyAgent4.setDesc("Doctor");
			pA.save(propertyAgent4);
			
			
			
			
			TestimonialEntity testimonialEntity = new TestimonialEntity();
			testimonialEntity.setDesc("this is very comfortable and safe site to rent or buy your Prefect Home.");
			testimonialEntity.setName("EsraaMAhmoud");
			testimonialEntity.setImgURL("http://localhost:8080/img/testimonial-1.jpg");
			testimonialEntity.setJob("Engineer");
			tp.save(testimonialEntity);
			TestimonialEntity testimonialEntity2 = new TestimonialEntity();
			testimonialEntity2.setDesc("this is very comfortable and safe site to rent or buy your Prefect Home.");
			testimonialEntity2.setName("ShimaaMAhmoud");
			testimonialEntity2.setImgURL("http://localhost:8080/img/testimonial-1.jpg");
			testimonialEntity2.setJob("Engineer");
			tp.save(testimonialEntity2);
		};
	}


}
