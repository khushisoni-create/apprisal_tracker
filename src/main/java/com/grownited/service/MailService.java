package com.grownited.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class MailService {
	
	@Autowired
	private JavaMailSender mailSender;
	public void sendWelcomeEmail (String email, String firstName, String password) {
		String subject = "Welcome to Appraisal Tracker";
		String body = "Welcome " + firstName + ",Your Account is successfully created on Appraisal Portal " + password + " this is your temporary password";
		String from = "nigamgajjar.ce@gmail.com";
		
		SimpleMailMessage message = new SimpleMailMessage();
		
		message.setFrom(from);
		message.setTo(email);
		message.setSubject(subject);
		message.setText(body);
		
		
		mailSender.send(message);
	}

}