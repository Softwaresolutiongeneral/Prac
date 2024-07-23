package com.example.ScrunchWorks;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table

public class Office {
	@Id
	@GeneratedValue
	private int employeeid;
	private String employeename;
	private String designation;
	private int no_of_employees;
	

	public Office(int employeeid, String employeename, String designation, int no_of_employees) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.designation = designation;
		this.no_of_employees = no_of_employees;
	}


	public Office() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getEmployeeid() {
		return employeeid;
	}


	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}


	public String getEmployeename() {
		return employeename;
	}


	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public int getNo_of_employees() {
		return no_of_employees;
	}


	public void setNo_of_employees(int no_of_employees) {
		this.no_of_employees = no_of_employees;
	}
	
	
	

}
