package com.example.studentmarksheet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentMarkSheetDao {
	@Autowired
	StudentMarkSheetRespository smsRepo;

	public String addMarkSheet(MarkSheet ms) {
		smsRepo.save(ms);
		return "Successfully Saved";
	}

	public MarkSheet getMarkSheet(int id) {
		return smsRepo.findById(id).get();
	}

	public String updateMarkSheet(MarkSheet id) {
		smsRepo.save(id);
		return "Succesfully Deleted";
	}

	public String deletMarkSheet(int id) {
		smsRepo.deleteById(id);
		return "Successfully Deleted";
	}

	public String addMarkSheetList(List<MarkSheet> ms) {
		smsRepo.saveAll(ms);
		return null;
	}

	public List<MarkSheet> getMarkSheetList() {
		return smsRepo.findAll();
	}
	
	
	public MarkSheet getRollNumberList(int number) {
		return smsRepo.getRollNumberList(number);
	}
	
	public int getSem1Total(int number) {
		return smsRepo.getSem1Total(number);
	}
	
	public int getSem2Total(int number) {
		return smsRepo.getSem2Total(number);
	}

}
