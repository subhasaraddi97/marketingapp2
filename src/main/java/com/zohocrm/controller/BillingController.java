package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Billing;
import com.zohocrm.entities.Contact;
import com.zohocrm.services.BillingService;
import com.zohocrm.services.ContactService;

@Controller
public class BillingController {

	@Autowired
	private ContactService contactservice;
	
	@Autowired
	private BillingService billingservice;
	
	
	@RequestMapping("/generateBill")
	public String getContactId(@RequestParam("id") long id,ModelMap  model)
	{
		Contact contact = contactservice.getOneContact(id);
		model.addAttribute("contact", contact);
		return "generate_Bill";
	}
	
	@RequestMapping("/savebill")
	public String saveBill(@ModelAttribute("abc") Billing bill) 
	{
		billingservice.saveBill(bill);
		
		return "generate_Bill";	
	} 
	
	@RequestMapping("/Listedbills")
	public String listbills(ModelMap model) 
	{
		 List<Billing> Bills = billingservice.getAllBills();
		 model.addAttribute("B", Bills);
		return "Billed_list";
		
	}
}
