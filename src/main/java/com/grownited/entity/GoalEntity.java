package com.grownited.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="goals")
public class GoalEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer goalID; //Primary Key
	private String apprisalID;
	private Integer employeeID;
	private String goalName;
	private String goalDescription;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startDate;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date endDate;
	private BigDecimal progress;
	private String status; //not started, in progress, completed etc
	
	//getters and setters for all above objects
	public Integer getGoalID() {
		return goalID;
	}
	public void setGoalID(Integer goalID) {
		this.goalID = goalID;
	}
	public String getApprisalID() {
		return apprisalID;
	}
	public void setApprisalID(String apprisalID) {
		this.apprisalID = apprisalID;
	}
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
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
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public BigDecimal getProgress() {
		return progress;
	}
	public void setProgress(BigDecimal progress) {
		this.progress = progress;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
