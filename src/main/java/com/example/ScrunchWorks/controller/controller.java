package com.example.ScrunchWorks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

public class controller {
	
	@Autowired
	service Service;
	@Autowired
	repository Repository;
	
	
	
	@GetMapping("/get the values from database")
	public list <office> officedetails()
	{
		return service getall();
	}
	
}
