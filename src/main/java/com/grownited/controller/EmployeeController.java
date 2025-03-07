package com.grownited.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.grownited.entity.DepartmentEntity;
import com.grownited.entity.GoalEntity;
import com.grownited.repository.DepartmentRepository;
import com.grownited.repository.GoalRepository;


@Controller
public class EmployeeController {
	
	@Autowired
	DepartmentRepository repodepartment;
	

	@GetMapping("employeehome")
	public String employeeHom() {
		return "EmployeeHome";
	}
	
	@Autowired
	GoalRepository repositorygoal;

	@PostMapping("savegoal")
	public String saveGoal(GoalEntity entityGoal) {
		entityGoal.setStatus("not started");
		repositorygoal.save(entityGoal);
		return "redirect:/listgoals";
	}
	
	@GetMapping("listgoals")
	public String listGoal(Model model) {
		
		List<GoalEntity> goalList = repositorygoal.findAll();
		model.addAttribute("goalList", goalList);
						// data name , data values    --> data name is used in jsp file to call that data from controller
		
		return "EmployeeHome";
	}
}