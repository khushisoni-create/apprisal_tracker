package com.grownited.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.grownited.entity.UserEntity;
import com.grownited.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class UserController {
	
	@Autowired
	UserRepository repositoryUser;
	 
	@GetMapping(value={"/","signup"})//url
	public String signup() {
		return "Signup";//jsp name
	}
	
	
	@GetMapping("newuser")
		public String newUser() {
		return "NewUser";
	}
	
	@PostMapping("saveuser")
	public String saveUser(UserEntity entityUser) {
		repositoryUser.save(entityUser);
		return "Login";
	}	 
	
	@GetMapping("listuser")
	public String listMember(Model model) {
		List<UserEntity> userList =repositoryUser.findAll(); 

	
		model.addAttribute("userList",userList );
		// dataName , dataValue

		return "ListUser";
	}

}
