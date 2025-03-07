package com.grownited.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="departments")
public class DepartmentEntity {

	@Id  //used to make departmentID as a primary key for this table
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer departmentID;
	
	@Column(unique = true)
	private String departmentName; /*name of departments like : HR, Account, IT, Marketing, Sales,
	Operations, Customer Support/Service, R&D, Legal, Administration, Procurement/Purchases, Quality Assurance,
	Public Relations(PR), Logistics & Supply Chain, Security etc*/
	
	//getter and setters to get and set values of departmentID and departmentName
	public Integer getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(Integer departmentID) {
		this.departmentID = departmentID;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
	
}
