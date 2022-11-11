package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.utility.Emailservice;

@Controller
public class EmailController {
	
	@Autowired
	private Emailservice emailservice;
	
	@RequestMapping("/sendEmail")
	public String sendEmail(@RequestParam("to") String to,@RequestParam("sub") String subject,@RequestParam("emailBody") String emailBody) {
		emailservice.sendEmail(to, subject, emailBody);
		return "compose_email";
	}
	

}
