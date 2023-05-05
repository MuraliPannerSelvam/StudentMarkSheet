package com.example.studentmarksheet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentMarkSheetController {
	@Autowired
	StudentMarkSheetService smsSer;

	@PostMapping(value = "/addMuraliMarkSheet")
	public String addMarkSheet(@RequestBody MarkSheet ms) {
		return smsSer.addMarkSheet(ms);
	}

	@GetMapping(value = "/getMarkSheet/{id}")
	public MarkSheet getMarkSheet(@PathVariable int id) {
		return smsSer.getMarkSheet(id);
	}

	@PutMapping(value = "/updateMarkSheet/{id}")
	public String updateMarkSheet(@RequestBody MarkSheet id) {
		return smsSer.updateMarkSheet(id);
	}

	@DeleteMapping(value = "/deleteMarkSheet/{id}")
	public String deleteMarkSheet(@PathVariable int id) {
		return smsSer.deleteMarkSheet(id);
	}

	@PostMapping(value = "/addMarkSheetList")
	public String addMarkSheetList(@RequestBody List<MarkSheet> ms) {
		return smsSer.addMarkSheetList(ms);
	}

	@GetMapping(value = "/getMarkSheetList")
	public List<MarkSheet> getMarkSheetList() {
		return smsSer.getMarkSheetList();
	}
	
	@GetMapping(value="/getRollNumberList/{number}")
	public MarkSheet getRollNumberList(@PathVariable int number) {
		return smsSer.getRollNumberList(number);
	}
	
	@GetMapping(value="/getSem1Total/{number}")
	public int getSem1Total(int number) {
		return smsSer.getSem1Total(number);
	}
	
	@GetMapping(value="/getSem2Total/{number}")
	public int getSem2Total(int number) {
		return smsSer.getSem2Total(number);
	}

}
