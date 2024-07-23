package com.example.OfficeEntity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="offices")

public class Staff {
	@Id
	private int employee_id;
	private String employee_name;
	private String employee_designation;
	private String employee_bloodgrp; 
	@Column(insertable=false, updatable=false)
	private int Project_id;
	@JsonBackReference//this annotation is used to map many to one 
	 @ManyToOne	
	    @JoinColumn(name="Project_id", nullable=false)
	    private Office office;
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Staff(int employee_id, String employee_name, String employee_designation, String employee_bloodgrp,
			int project_id, Office office) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employee_designation = employee_designation;
		this.employee_bloodgrp = employee_bloodgrp;
		Project_id = project_id;
		this.office = office;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getEmployee_designation() {
		return employee_designation;
	}
	public void setEmployee_designation(String employee_designation) {
		this.employee_designation = employee_designation;
	}
	public String getEmployee_bloodgrp() {
		return employee_bloodgrp;
	}
	public void setEmployee_bloodgrp(String employee_bloodgrp) {
		this.employee_bloodgrp = employee_bloodgrp;
	}
	public int getProject_id() {
		return Project_id;
	}
	public void setProject_id(int project_id) {
		Project_id = project_id;
	}
	public Office getOffice() {
		return office;
	}
	public void setOffice(Office office) {
		this.office = office;
	}
	
	
	

}
