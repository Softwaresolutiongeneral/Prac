package com.example.OfficeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OfficeEntity.Office;
import com.example.OfficeRepository.Officerepo;
import com.example.OfficeService.Officeservice;

@RestController
@RequestMapping ("/api")

public class Officecontroller {
	@Autowired
	Officeservice  officeservice;
	@Autowired
	Officerepo officerepo;  
	
	@GetMapping("/getby")
public List<Office>getby()
{
		return officeservice.getall(); 
		}
	@PostMapping("/insert")
	public Office insertdata(@RequestBody Office office)
	{
		return officeservice.insertcust(office);
		
	}
	@PutMapping("/update")
	public Office updatedata(@RequestBody Office upload)
	{
		return officerepo.save(upload);
	}
	@DeleteMapping("/Delete")
	public Office deletedata(@RequestBody Office delete)
	{
		return officerepo.save(delete); 
	}
	
}
