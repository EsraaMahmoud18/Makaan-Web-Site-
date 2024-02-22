package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.database.entity.ContactEntity;
import com.example.demo.service.ContactService;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Controller
public class ContactController {
//	private final ContactService contactService;
// @GetMapping("/contact")
// public String contactUs(Model model)
// {
//	 model.addAttribute("contact",new ContactEntity());
//	 return "contact";
// }
// @PostMapping("/contact")
// public String addContactUs(@ModelAttribute("contact") ContactEntity contactEntity)
// {
//	 contactService.addNewContact(contactEntity);
//	 return "redirect:/";
// }
}
