package com.grownited.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="trainingrecommendations")
public class TrainingRecommendationEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer recommendationID;
	private Integer apprisalID; //FK
	private Integer employeeID; //FK
	private String trainingName; //name of the recommended training
	private String trainingDescritpion; //description of the training
	private String status; //status of the training(e.g. recommended, completed)
	private String recommendedBy;
	public Integer getRecommnedationID() {
		return recommendationID;
	}
	public void setRecommnedationID(Integer recommnedationID) {
		this.recommendationID = recommnedationID;
	}
	public Integer getApprisalID() {
		return apprisalID;
	}
	public void setApprisalID(Integer apprisalID) {
		this.apprisalID = apprisalID;
	}
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public String getTrainingName() {
		return trainingName;
	}
	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}
	public String getTrainingDescritpion() {
		return trainingDescritpion;
	}
	public void setTrainingDescritpion(String trainingDescritpion) {
		this.trainingDescritpion = trainingDescritpion;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRecommendedBy() {
		return recommendedBy;
	}
	public void setRecommendedBy(String recommendedBy) {
		this.recommendedBy = recommendedBy;
	}
	
	
}
