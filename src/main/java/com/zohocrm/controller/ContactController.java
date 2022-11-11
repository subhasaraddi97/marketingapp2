package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Contact;
import com.zohocrm.services.ContactService;

@Controller
public class ContactController {

	@Autowired
	private ContactService contactservice;

	@RequestMapping("/findcontactById")
	public String findcontact(@RequestParam("id") long id, ModelMap m) {
		Contact contact = contactservice.getOneContact(id);
		m.addAttribute("c", contact);
		return "contact_info";

	}

}
