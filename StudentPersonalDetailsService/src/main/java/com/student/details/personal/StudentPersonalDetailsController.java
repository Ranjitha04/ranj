package com.student.details.personal;

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
public class StudentPersonalDetailsController {

	@Autowired
	StudentPersonalDetailsService studentPersonalDetailsService;

	@GetMapping("/personal/all")
	public List<Student> getStudentsDetails() {
		return studentPersonalDetailsService.getStudentsDetails();
	}
	
	@GetMapping("/personal/student/{id}")
	public Student getStudentDetailsById(@PathVariable String id) {
		return studentPersonalDetailsService.getStudentById(id);
	}
	
	@PostMapping("/personal/student")
	public void addStudentDetails(@RequestBody Student student) {
		 studentPersonalDetailsService.setStudentDetails(student);
	}
	
	@PutMapping("/personal/student")
	public void updateStudentDetails(@RequestBody Student student) {
		 studentPersonalDetailsService.updateStudentDetails(student);
	}
	
	@DeleteMapping("/personal/student/{id}")
	public void deleteStudentDetails(@PathVariable String id) {
		 
		Student student = studentPersonalDetailsService.getStudentById(id);
		 studentPersonalDetailsService.deleteStudentDetails(student);
	}
	
	
	
}
