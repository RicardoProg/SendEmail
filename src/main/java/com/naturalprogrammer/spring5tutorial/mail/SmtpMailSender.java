package com.naturalprogrammer.spring5tutorial.mail;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;


public class SmtpMailSender implements MailSender {
	
	//private static Log log = LogFactory.getLog(SmtpMailSender.class);
	
	private JavaMailSender javaMailSender;
	
	public SmtpMailSender(JavaMailSender javaMailSender) {
		super();
		this.javaMailSender = javaMailSender;
	}

	@Override
	public void send(String to, String subject, String body) {		
	      	        
	        SimpleMailMessage message = new SimpleMailMessage(); 
	        message.setFrom("noreply@baeldung.com");
	        message.setTo(to); 
	        message.setSubject(subject); 
	        message.setText(body);
	        javaMailSender.send(message);	        
	    
	}
	
	

}
