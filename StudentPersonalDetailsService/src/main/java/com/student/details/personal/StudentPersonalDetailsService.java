package com.student.details.personal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentPersonalDetailsService {

	@Autowired
	StudentsPersonalDetailsRepository studentRepository;
	
	public List<Student> getStudentsDetails() {
		List<Student> list = new ArrayList<>();
		studentRepository.findAll().forEach(list:: add);
		return list;
	}
	
	public Student getStudentById(String usn) {
		return studentRepository.findById(usn).orElse(null);
	}
	
	public void setStudentDetails(Student student) {
		studentRepository.save(student);
	}
	
	public void updateStudentDetails(Student student) {
		studentRepository.save(student);
	}
	
	public void deleteStudentDetails(Student student) {
		studentRepository.delete(student);
	}
}
