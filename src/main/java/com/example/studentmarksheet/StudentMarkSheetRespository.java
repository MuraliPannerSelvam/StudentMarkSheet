package com.example.studentmarksheet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentMarkSheetRespository extends JpaRepository<MarkSheet, Integer> {

	@Query(value = "select * from mark_sheet where roll_number=?", nativeQuery = true)
	public MarkSheet getRollNumberList(int number);
	
	@Query(value = "select sem1_total from mark_sheet where roll_number=?", nativeQuery = true)
	public int getSem1Total(int number);
	
	@Query(value = "select sem2_total from mark_sheet where roll_number=?", nativeQuery = true)
	public int getSem2Total(int number);
	
	

}
