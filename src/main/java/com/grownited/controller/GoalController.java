package com.grownited.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import com.grownited.entity.GoalEntity;
import com.grownited.repository.GoalRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class GoalController {
	@Autowired
	GoalRepository repositorygoal;
	
	@GetMapping("newgoal")
	public String newGoal() {
		return "NewGoal";
	}
	
	@PostMapping("savegoal")
	public String saveGoal(GoalEntity entityGoal) {
		repositorygoal.save(entityGoal);	
		return "";
	}
	
	
	

}
