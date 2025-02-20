package com.grownited.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.grownited.entity.FeedbackEntity;
import com.grownited.entity.PreformanceReviewEntity;
import com.grownited.repository.FeedbackRepository;
import com.grownited.repository.PreformanceReviewRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class PreformanceReviewController {
 @Autowired
 	PreformanceReviewRepository repositorPreformanceReview ;
 
 
 @GetMapping("newPreformanceReview ")
	public String newPreformanceReview () {
		return "NewPreformanceReview ";
	}
 
 @PostMapping("savePreformanceReview")
 public String savePreformanceReview(PreformanceReviewEntity entityPreformanceReview) {
	 repositorPreformanceReview.save(entityPreformanceReview);
    
     return "";
 }
 
}
