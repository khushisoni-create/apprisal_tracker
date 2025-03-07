package com.grownited.entity;

import java.text.DecimalFormat;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="apprisals")
public class AppraisalEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer apprisalID; //Primary Key
	private Integer userID;
	private String appraisalCycle;
	private Date startDate;
	private Date endDate;
	private DecimalFormat overallRating; //Final performance rating for the appraisal cycle
	private String status;
	private Integer reviewerID;
	private String comments;
	
	public Integer getApprisalID() {
		return apprisalID;
	}
	public void setApprisalID(Integer apprisalID) {
		this.apprisalID = apprisalID;
	}
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public String getAppraisalCycle() {
		return appraisalCycle;
	}
	public void setAppraisalCycle(String appraisalCycle) {
		this.appraisalCycle = appraisalCycle;
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
	public DecimalFormat getOverallRating() {
		return overallRating;
	}
	public void setOverallRating(DecimalFormat overallRating) {
		this.overallRating = overallRating;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getReviewerID() {
		return reviewerID;
	}
	public void setReviewerID(Integer reviewerID) {
		this.reviewerID = reviewerID;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
		
}
