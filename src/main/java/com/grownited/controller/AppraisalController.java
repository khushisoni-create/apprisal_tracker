package com.grownited.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.grownited.entity.AppraisalEntity;
import com.grownited.repository.AppraisalRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;




@Controller

public class AppraisalController {
	@Autowired
	AppraisalRepository repositoryAppraisal;
	
	@GetMapping("newappraisal")
		public String newAppraisal() {
		return "NewAppraisal";
	}
	
	@PostMapping("saveappraisal")
	public String saveAppraisal(AppraisalEntity entityAppraisal) {
			repositoryAppraisal.save(entityAppraisal);
		return "";
	}
	
	

}
