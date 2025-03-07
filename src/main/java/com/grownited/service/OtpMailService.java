package com.grownited.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class OtpMailService {

	@Autowired
	private JavaMailSender mailSender;
	public void sendOtpMail (String email, String otp) {
		String subject = "Forgot Password";
		String body = "This is your otp : " + otp;
		String from = "nigamgajjar.ce@gmail.com";
		
		SimpleMailMessage message = new SimpleMailMessage();
		
		message.setFrom(from);
		message.setTo(email);
		message.setSubject(subject);
		message.setText(body);
		
		
		mailSender.send(message);
	}
	
}