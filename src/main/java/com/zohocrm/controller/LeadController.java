package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Contact;
import com.zohocrm.entities.Lead;
import com.zohocrm.services.ContactService;
import com.zohocrm.services.LeadService;

@Controller
public class LeadController {

	@Autowired
	private LeadService leadservice;

	@Autowired
	private ContactService ContactService;

	@RequestMapping("/viewLeadPage")
	public String viewLeadPage() {
		return "create__leadjsp";
	}

	@RequestMapping("/savelead")
	public String savelead(@ModelAttribute("lead") Lead lead, ModelMap model) {
		leadservice.saveOneLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
	}

	@RequestMapping("/composeEmail")
	public String composeEmail(@RequestParam("email") String email, ModelMap model) {
		model.addAttribute("email", email);
		return "compose_email";
	}

	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id,ModelMap model) {
		Lead lead = leadservice.getOneLead(id);
		
		Contact contact = new Contact();
		
		contact.setFirstname(lead.getFirstname());
		contact.setLastname(lead.getLastname());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		
		ContactService.saveOneContact(contact);
		
		leadservice.deleteOneLead(lead.getId());
		
		return "create__leadjsp";
	}

	@RequestMapping("/listall")
	public String getAllLeads(ModelMap model) {
		List<Lead> leads = leadservice.listLeads();
		model.addAttribute("leads", leads);
		return "list_leads";
	}

	@RequestMapping("/findLeadById")
	public String findOneLead(@RequestParam("id") long id, ModelMap model) {
		Lead lead = leadservice.getOneLead(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	
	@RequestMapping("/ListedContacts")
	public String getAllContacts(ModelMap m)
	{
		List<Contact> contact = ContactService.getAllContacts();
		m.addAttribute("c", contact);
		return "list_contacts";
		
	}
	
}
