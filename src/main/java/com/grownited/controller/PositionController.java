package com.grownited.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.grownited.entity.PositionEntity;
import com.grownited.repository.PositionRepository;

@Controller
public class PositionController {
	
	@Autowired
	PositionRepository repoposition;
	
	@PostMapping("saveposition")
	public String savePosition(PositionEntity entityPosition) {
		
		repoposition.save(entityPosition);
		return "redirect:/newdepartment";
	}
	
	
}