package com.example.OfficeRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OfficeEntity.Staff;

@Repository

public interface Staffrepo extends JpaRepository<Staff, Integer> {

}
