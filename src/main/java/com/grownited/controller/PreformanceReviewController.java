package com.grownited.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.grownited.entity.FeedbackEntity;
import com.grownited.entity.PerformanceReviewEntity;
import com.grownited.entity.PerformanceReviewEntity;
import com.grownited.repository.FeedbackRepository;
import com.grownited.repository.PerformanceReviewRepository;
import com.grownited.repository.PerformanceReviewRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class PreformanceReviewController {
 @Autowired
 	PerformanceReviewRepository repositorPreformanceReview ;
 
 
 @GetMapping("newPreformanceReview ")
	public String newPreformanceReview () {
		return "NewPreformanceReview ";
	}
 
 @PostMapping("savePreformanceReview")
 public String savePreformanceReview(PerformanceReviewEntity entityPreformanceReview) {
	 repositorPreformanceReview.save(entityPreformanceReview);
    
     return "";
 }
 
}
