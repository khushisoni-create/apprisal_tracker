package com.grownited.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TrainingRecommendation")

public class TrainingRecommendationEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer recommendationId;
	private Integer appraisalId;
	private Integer employeeId;
	private Integer recommendedBy;
	private String trainingName;
	private String trainingDescription;
	private String status;
	public Integer getRecommendationId() {
		return recommendationId;
	}
	public void setRecommendationId(Integer recommendationId) {
		this.recommendationId = recommendationId;
	}
	public Integer getAppraisalId() {
		return appraisalId;
	}
	public void setAppraisalId(Integer appraisalId) {
		this.appraisalId = appraisalId;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public Integer getRecommendedBy() {
		return recommendedBy;
	}
	public void setRecommendedBy(Integer recommendedBy) {
		this.recommendedBy = recommendedBy;
	}
	public String getTrainingName() {
		return trainingName;
	}
	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}
	public String getTrainingDescription() {
		return trainingDescription;
	}
	public void setTrainingDescription(String trainingDescription) {
		this.trainingDescription = trainingDescription;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
