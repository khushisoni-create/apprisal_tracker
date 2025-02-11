package com.grownited.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SessionController {
	
	@GetMapping("signup")
	public String signup() {
		return new String();
	}
	
	@GetMapping("path")
	public String login() {
		return "Login";
	}
	

}
