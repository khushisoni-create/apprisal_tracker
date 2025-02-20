package com.grownited.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.grownited.entity.UserEntity;


@Controller
public class SessionController {
	
//	@GetMapping(value={"/","signup"})//url
//	public String signup() {
//		return "Signup";//jsp name
//	}
	
	@GetMapping("login")
	public String login(String email,String password ) {
		return "Login";//Jsp name
	}
	
//	@PostMapping("saveuser")
//	public String saveUser(UserEntity userEntity)
//	{
//		System.out.println(userEntity.getFirstName());
//		System.out.println(userEntity.getLastName());
//		System.out.println(userEntity.getGender());
//		System.out.println(userEntity.getEmail());
//		System.out.println(userEntity.getPassword());
//		return "Login";//jsp
//	}
//	
	
	
	@GetMapping("changepassword")
	public String changepassword() {
		return "ChangePassword";
	}
	
	@GetMapping("forgetpassword")
	public String forgetpassword() {
		return "ForgetPassword";
	}
	

}
