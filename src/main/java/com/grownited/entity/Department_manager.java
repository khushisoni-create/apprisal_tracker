package com.grownited.entity;

import org.springframework.stereotype.Controller;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Controller
@Table(name="Department_manager")

public class Department_manager {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY )

	private Integer departmentId;
	private Integer userId;
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
}
