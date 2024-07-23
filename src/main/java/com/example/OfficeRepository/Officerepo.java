package com.example.OfficeRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OfficeEntity.Office;

@Repository


public interface Officerepo extends JpaRepository<Office, Integer> {

}
