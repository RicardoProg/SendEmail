package com.naturalprogrammer.spring5tutorial.mail;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.mail.javamail.JavaMailSender;

@Configuration
public class MailConfig {
	
	@Bean
	public DemoBean demoBean(){
		
		return new DemoBean();
	}

	@Bean
	@Profile("dev")
	public MailSender mockMailSender() {
		return new MockMailSender();
	}
	
	@Bean
	@Profile("!dev")
	public MailSender smtpMailSender(JavaMailSender javaMailSender) {
		
		demoBean();
		return new SmtpMailSender(javaMailSender);
	}
}
