package com.grownited.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.grownited.entity.FeedbackEntity;
import com.grownited.repository.FeedbackRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FeedbackController {
	@Autowired
	  FeedbackRepository repositorFeedback;
	
	@GetMapping("newfeedback")
	public String newFeedback() {
		return "NewFeedback";
	}
	
	@PostMapping("saveFeedback")
	public String saveFeedback(FeedbackEntity entityFeedback) {
		repositorFeedback.save(entityFeedback);	
		return "";
	}
	

}
