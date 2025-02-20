package com.grownited.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PreformanceReview")

public class PreformanceReviewEntity {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Integer reviewId;
	private Integer appraisalId;
	private Integer employeedId;
	private Integer reviewerId;
	private String reviewDate;
	private String strengths;
	private String improvementAreas;
	private String comments;
	private float finalRating;
	public Integer getReviewId() {
		return reviewId;
	}
	public void setReviewId(Integer reviewId) {
		this.reviewId = reviewId;
	}
	public Integer getAppraisalId() {
		return appraisalId;
	}
	public void setAppraisalId(Integer appraisalId) {
		this.appraisalId = appraisalId;
	}
	public Integer getEmployeedId() {
		return employeedId;
	}
	public void setEmployeedId(Integer employeedId) {
		this.employeedId = employeedId;
	}
	public Integer getReviewerId() {
		return reviewerId;
	}
	public void setReviewerId(Integer reviewerId) {
		this.reviewerId = reviewerId;
	}
	public String getReviewDate() {
		return reviewDate;
	}
	public void setReviewDate(String reviewDate) {
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
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public float getFinalRating() {
		return finalRating;
	}
	public void setFinalRating(float finalRating) {
		this.finalRating = finalRating;
	}

}


