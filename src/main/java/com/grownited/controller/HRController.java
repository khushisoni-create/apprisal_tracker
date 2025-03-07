package com.grownited.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.grownited.entity.DepartmentEntity;
import com.grownited.entity.UserEntity;
import com.grownited.repository.DepartmentRepository;
import com.grownited.repository.SignupRepository;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@Controller
public class HRController {
	
	@Autowired
	SignupRepository repositoryuser;

	
	@GetMapping("hrhome")               
	public String listofUsers(Model model) {
//		List<UserEntity> userlist = repositoryuser.findAll();
//		model.addAttribute("userlist", userlist);
		return "HRHome";
	}
	
	@GetMapping("viewemployee")
	public String viewEmployee(Integer userID, Model model) {
		
		
		List<UserEntity> userList = repositoryuser.findAll();
		model.addAttribute("userList", userList);
		
//		belowed code is used to find particular user's details, not all users details
//		System.out.println("id ===> " + userID);
//		Optional<UserEntity> op = repositoryuser.findById(userID);
//		
//		if (op.isEmpty()) {
//			
//		} else {
//			
//			UserEntity user = op.get();
//			
//			model.addAttribute("user", user);
//		}
//		
		return "ListUsers";
	}
	
	@GetMapping("viewparticularemployee")
	public String viewParticularEmployee(Integer userID, Model model) {
		
		System.out.println("id ===> " + userID);
		Optional<UserEntity> op = repositoryuser.findById(userID);
		
		if (op.isEmpty()) {
			
		} else {
			
			UserEntity user = op.get();
			
			model.addAttribute("user", user);
		}
		return "ViewParticularEmployee";
	}
//	
//	@GetMapping("deleteemployee")
//	public String deleteEmployee(Integer userID) {
//		repositoryuser.deleteById(userID);
//		return "redirect:/hrhome";
//	}
//	
//	
	
}