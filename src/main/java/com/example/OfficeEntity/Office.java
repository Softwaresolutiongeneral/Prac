package com.example.OfficeEntity;

import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="work")


public class Office {
	@Id
	private int project_id;
	private String project_name;
	private String project_head;
	@JsonManagedReference //this annotation is used to do onetomany mapping
	@OneToMany (mappedBy = "office")//one to many mapped by string name.   
	private List<Staff>staff;
	public Office() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Office(int project_id, String project_name, String project_head, List<Staff> staff) {
		super();
		this.project_id = project_id;
		this.project_name = project_name;
		this.project_head = project_head;
		this.staff = staff;
	}
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getProject_head() {
		return project_head;
	}
	public void setProject_head(String project_head) {
		this.project_head = project_head;
	}
	public List<Staff> getStaff() {
		return staff;
	}
	public void setStaff(List<Staff> staff) {
		this.staff = staff;
	}
	@Override
	public String toString() {
		return "Office [project_id=" + project_id + ", project_name=" + project_name + ", project_head=" + project_head
				+ ", staff=" + staff + ", getProject_id()=" + getProject_id() + ", getProject_name()="
				+ getProject_name() + ", getProject_head()=" + getProject_head() + ", getStaff()=" + getStaff()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}

