package com.example.studentmarksheet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentMarkSheetService {
	@Autowired
	StudentMarkSheetDao smsDao;

	public String addMarkSheet(MarkSheet ms) {
		ms.setSem1_total(ms.getSem1_theory()+ms.getSem1_practicals());
		ms.setSem2_total(ms.getSem2_theory()+ms.getSem2_practicals());
		return smsDao.addMarkSheet(ms);
	}

	public MarkSheet getMarkSheet(int id) {
		return smsDao.getMarkSheet(id);
	}

	public String updateMarkSheet(MarkSheet id) {
		return smsDao.updateMarkSheet(id);
	}

	public String deleteMarkSheet(int id) {
		return smsDao.deletMarkSheet(id);
	}

	public String addMarkSheetList(List<MarkSheet> ms) {
		return smsDao.addMarkSheetList(ms);
	}

	public List<MarkSheet> getMarkSheetList() {
		return smsDao.getMarkSheetList();
	}
	
	public MarkSheet getRollNumberList(int number) {
		return smsDao.getRollNumberList(number);
	}
	
	public int getSem1Total(int number) {
		return smsDao.getSem1Total(number);
	}
	
	public int getSem2Total(int number) {
		return smsDao.getSem2Total(number);
	}

}
