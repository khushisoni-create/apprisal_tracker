package com.grownited.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.grownited.entity.DepartmentEntity;
import com.grownited.repository.DepartmentRepository;
import com.grownited.repository.PositionRepository;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class DepartmentController {
	
	
	@Autowired
	DepartmentRepository repodepartment;
	
	@Autowired
	PositionRepository repoposition;

	@GetMapping("newdepartment")
	public String getDepartmentName(Model model) {
		List<DepartmentEntity> allDepartment = repodepartment.findAll();
		
		model.addAttribute("allDepartment", allDepartment);
		return "NewDepartment";
	}
	
	@PostMapping("savedepartment")
	public String saveDepartment(DepartmentEntity entitydepartment) {
		
		repodepartment.save(entitydepartment);
		return "redirect:/newdepartment";
	}
	
	
	@GetMapping("viewdepartments")
	public String viewDepartments(Model model) {
		
		List<DepartmentEntity> allDepartments = repodepartment.findAll();
		
		model.addAttribute("allDepartments", allDepartments);
		return "ViewDepartment";
	}
	
	@GetMapping("viewparticulardepartment")
	public String viewParticularDepartment(Model model) {
		return "ViewParticularDepartment";
	}
	
	@GetMapping("deletedepartment")
	public String deleteDepartment(Integer departmentID) {
		repodepartment.deleteById(departmentID);
		return "redirect:/viewdepartments";
	}
	
}