package com.example.ScrunchWorks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {
	@Autowired
	repo Repository;
	public list <office> officedetails()
	{
		return repository. searchdetails();
		
	}

}
