package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.database.entity.ContactEntity;
import com.example.demo.database.entity.NewsLetterEntity;
import com.example.demo.database.entity.PropertyAgents;
import com.example.demo.database.entity.PropertyList;
import com.example.demo.database.entity.TestimonialEntity;
import com.example.demo.service.ContactService;
import com.example.demo.service.NewsLetterService;
import com.example.demo.service.PropertyAgentsService;
import com.example.demo.service.PropertyListService;
import com.example.demo.service.TestimonialService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MainController {
   private final ContactService contactService;
   private final NewsLetterService newsLetterService;
   private final PropertyListService propertyListService;
   private final PropertyAgentsService propertyAgentsService;
 private final TestimonialService testimonialService;
   @PostMapping("/newsletter")
   public String addNewsLetter(@RequestParam("email") String email)
   {
	   NewsLetterEntity nle = new NewsLetterEntity();
	   nle.setEmail(email);
   	 newsLetterService.addNewNewsletter(nle);
   	 return "redirect:/";
   }
@GetMapping("/contact")
public String contactUs(Model model)
{
	 model.addAttribute("contact",new ContactEntity());
	 return "contact";
}
@PostMapping("/contact")
public String addContactUs(@ModelAttribute("contact") ContactEntity contactEntity)
{
	 contactService.addNewContact(contactEntity);
	 return "redirect:/thanks";
}
@GetMapping("/thanks")
public String getThanks()
{
	return "thanks";
}
@GetMapping("/")
public String homePage( Model model)
{
	List<PropertyList> properties = propertyListService.getAll();
	System.out.println(properties);
	model.addAttribute("property",properties);
	return "index";
}
@GetMapping("/about")
public String aboutUs( Model model)
{
	List<PropertyAgents> propertyAgent = propertyAgentsService.getAll();
	model.addAttribute("propertyAgent",propertyAgent);
	return "about";
}
@GetMapping("/propertyAgent")
public String propertyAgent(Model model)
{ 
	List<PropertyAgents> propertyAgent = propertyAgentsService.getAll();
	model.addAttribute("propertyAgent",propertyAgent);
	return "property-agent";
}
@GetMapping("/propertyList")
public String propertyList(Model model)
{
	List<PropertyList> properties = propertyListService.getAll();
	model.addAttribute("property",properties);
	return "property-list";
}
@GetMapping("/addNewProduct")
public String addNewProduct(Model model)
{
	model.addAttribute("product",new PropertyList());
	return "addNewProduct";
}

@PostMapping("/addNewProduct")
public String postNewProduct(@ModelAttribute("product") PropertyList propertyList)
{
	propertyListService.addNewProperty(propertyList);
	return "redirect:/";
}
@GetMapping("/addYourOpionion")
public String addYourOpionion(Model model)
{
	model.addAttribute("opinion",new TestimonialEntity());
	return "addYourOpionion";
}

@PostMapping("/addYourOpionion")
public String postYourOpionion(@ModelAttribute("opinion") TestimonialEntity testimonialEntity)
{
	testimonialService.addNewOpionion(testimonialEntity);
	return "redirect:/";
}
@GetMapping("/propertyType")
public String propertyType()
{
	return "property-type";
}
@GetMapping("/testimonial")
public String testimonial(Model model)
{
	List<TestimonialEntity> testimonials = testimonialService.getAll();
	model.addAttribute("testimonials",testimonials);
	return "testimonial";
}
}
