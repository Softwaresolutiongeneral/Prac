package com.example.OfficeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OfficeEntity.Office;
import com.example.OfficeEntity.Staff;
import com.example.OfficeRepository.Officerepo;
import com.example.OfficeRepository.Staffrepo;

@Service
public class Officeservice {
	@Autowired
	Officerepo officerepo;
	@Autowired
	Staffrepo staffrep;
	
	public List<Office>getall()
	{
		return officerepo.findAll();
	}
	public Office insertcust(Office office) {
		 for (Staff staff : office.getStaff() ) {
	            staff.setOffice(office);
	            staffrep.save(staff);
	        }
	        return officerepo.save(office);
	}

}
