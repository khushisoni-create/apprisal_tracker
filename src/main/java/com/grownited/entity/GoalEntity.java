package com.grownited.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="goal")

public class GoalEntity {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer goalId;
 private String	appraisalId;
 private String	employeedId;
 private String goalName;
 private String goalDescription;
 private String startDate;
 private String endDate;
 private Float progress;
 private String Status;
public Integer getGoalId() {
	return goalId;
}
public void setGoalId(Integer goalId) {
	this.goalId = goalId;
}
public String getAppraisalId() {
	return appraisalId;
}
public void setAppraisalId(String appraisalId) {
	this.appraisalId = appraisalId;
}
public String getEmployeedId() {
	return employeedId;
}
public void setEmployeedId(String employeedId) {
	this.employeedId = employeedId;
}
public String getGoalName() {
	return goalName;
}
public void setGoalName(String goalName) {
	this.goalName = goalName;
}
public String getGoalDescription() {
	return goalDescription;
}
public void setGoalDescription(String goalDescription) {
	this.goalDescription = goalDescription;
}
public String getStartDate() {
	return startDate;
}
public void setStartDate(String startDate) {
	this.startDate = startDate;
}
public String getEndDate() {
	return endDate;
}
public void setEndDate(String endDate) {
	this.endDate = endDate;
}
public Float getProgress() {
	return progress;
}
public void setProgress(Float progress) {
	this.progress = progress;
}
public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}

}
