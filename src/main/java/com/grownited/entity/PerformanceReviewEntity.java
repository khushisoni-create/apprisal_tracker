package com.grownited.entity;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="performancereviews")
public class PerformanceReviewEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer reviewID; //Primary Key
	private Integer apprisalID; //Foreign Key
	private Integer employeeID; //Foreign Key
	private Integer reviewerID; //Foreign Key
	private Date reviewDate;
	private String strengths;
	private String improvementAreas;
	private BigDecimal finalRating;
	private String comments;
	public Integer getReviewID() {
		return reviewID;
	}
	public void setReviewID(Integer reviewID) {
		this.reviewID = reviewID;
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
	public Integer getReviewerID() {
		return reviewerID;
	}
	public void setReviewerID(Integer reviewerID) {
		this.reviewerID = reviewerID;
	}
	public Date getReviewDate() {
		return reviewDate;
	}
	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}
	public String getStrengths() {
		return strengths;
	}
	public void setStrengths(String strengths) {
		this.strengths = strengths;
	}
	public String getImprovementAreas() {
		return improvementAreas;
	}
	public void setImprovementAreas(String improvementAreas) {
		this.improvementAreas = improvementAreas;
	}
	public BigDecimal getFinalRating() {
		return finalRating;
	}
	public void setFinalRating(BigDecimal finalRating) {
		this.finalRating = finalRating;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
}
