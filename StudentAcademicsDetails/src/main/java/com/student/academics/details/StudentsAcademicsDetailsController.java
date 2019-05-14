package com.student.academics.details;

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
public class StudentsAcademicsDetailsController {

	@Autowired
	StudentAcademicsDetailsService studentAcademicsDetailsService;

	@GetMapping("/academics/all")
	public List<Academics> getStudentsDetails() {
		return studentAcademicsDetailsService.getStudentsDetails();
	}
	
	@GetMapping("/academics/details/{id}")
	public Academics getStudentDetailsById(@PathVariable String id) {
		return studentAcademicsDetailsService.getStudentDetailsById(id);
	}
	
	@PostMapping("/academics/details")
	public void addStudentDetails(@RequestBody Academics details) {
		studentAcademicsDetailsService.setAggregate(details);
		 studentAcademicsDetailsService.setStudentAcademicDetails(details);
	}
	
	@PutMapping("/academics/details")
	public void updateStudentDetails(@RequestBody Academics details) {
		studentAcademicsDetailsService.setAggregate(details);
		 studentAcademicsDetailsService.updateStudentDetails(details);
	}
	
	@DeleteMapping("/academics/details/{id}")
	public void deleteStudentDetails(@PathVariable String id) {
		 
		 Academics student = studentAcademicsDetailsService.getStudentDetailsById(id); 
		 studentAcademicsDetailsService.deleteStudentDetails(student);
	}
	
	
}
