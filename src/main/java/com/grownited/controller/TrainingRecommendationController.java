package com.grownited.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.grownited.entity.TrainingRecommendationEntity;
import com.grownited.repository.TrainingRecommendationRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller

public class TrainingRecommendationController {
@Autowired
TrainingRecommendationRepository repositorTrainingRecommendation;

@GetMapping("TrainingRecommendation")
public String newTrainingRecommendation() {
	return "NewTrainingRecommendation";
}
@PostMapping("saveTrainingRecommendation")
public String saveTrainingRecommendation (TrainingRecommendationEntity entitysaveTrainingRecommendation) {
	repositorTrainingRecommendation.save(entitysaveTrainingRecommendation);
    
    
    return "";
}

}
