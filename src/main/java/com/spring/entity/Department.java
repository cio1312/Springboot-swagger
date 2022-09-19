package com.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Annotations
@Entity       // defines that a class can be mapped to a table.
//@NoArgsConstructor // used to generate the no-argument constructor for a class
//@AllArgsConstructor //  used to generate the argument constructor for a class
//@Builder  //produces complex builder APIs for your classes
public class Department {
	
    @Id// indicating the member field below is the primary key of the current entity
    @GeneratedValue(strategy = GenerationType.AUTO) // the entity identifier value is automatically generated using an identity column, a database sequence, or a table generator.
    private Long departmentId;
	private String departmentName;
    private String departmentAddress;
	private String departmentCode;
	
    public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(String departmentName, String departmentAddress, String departmentCode) {
		super();
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
		this.departmentCode = departmentCode;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentAddress() {
		return departmentAddress;
	}
	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}


}
