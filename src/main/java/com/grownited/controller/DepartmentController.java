package com.grownited.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.grownited.entity.DepartmentEntity;
import com.grownited.repository.DepartmentRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller

public class DepartmentController {
	
@Autowired
DepartmentRepository repositorDepartment;


@GetMapping("newDepartment")
public String newDepartment() {
	return "NewDepartment";
}

	@PostMapping("saveDepartment")
	public String saveDepartment(DepartmentEntity entityDepartment) {
		repositorDepartment.save(entityDepartment);
		
		return "";
	}
	
}
