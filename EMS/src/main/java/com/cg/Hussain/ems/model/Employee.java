package com.cg.Hussain.ems.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Id
	private int id;
	private String name;
	private String department;
	private String designation;
	
//	@DBRef
	private Address address;
	
	@Transient
	public static final String SEQUENCE_NAME = "users_sequence";
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee(int id, String name, String department, String designation, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.address = address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", designation=" + designation
				+ ", address=" + address + "]";
	}
	
	

}
