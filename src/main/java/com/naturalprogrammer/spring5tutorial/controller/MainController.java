package com.naturalprogrammer.spring5tutorial.controller;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naturalprogrammer.spring5tutorial.mail.MailSender;

@RestController
public class MainController {
	
	
	private MailSender mailSender;
	
	public MainController(MailSender smtp) {
		this.mailSender = smtp;
	}

	@RequestMapping("/mail")
	public String mail() {
		
		mailSender.send("ricardo.programador8@gmail.com", "test email", "Body of the test email");
		
		return "Mail sent";
	}
}
