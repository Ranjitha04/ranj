package com.student.academics.details;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentAcademicsDetailsService {

	@Autowired
	StudentsAcademicsRepository studentsAcademicsRepository;
	
	public List<Academics> getStudentsDetails() {
		List<Academics> list = new ArrayList<>();
		studentsAcademicsRepository.findAll().forEach(list:: add);
		return list;
	}

	public Academics getStudentDetailsById(String usn) {
		return studentsAcademicsRepository.findById(usn).orElse(null);
	}

	public void setStudentAcademicDetails(Academics details) {
		studentsAcademicsRepository.save(details);
	}

	public void updateStudentDetails(Academics details) {
		studentsAcademicsRepository.save(details);
	}

	public void deleteStudentDetails(Academics details) {
		studentsAcademicsRepository.delete(details);
	}
	
	public void setAggregate(Academics details) {
		details.setAggregate_marks(details.getYear1() + details.getYear2() + details.getYear3() + details.getYear4());
	}
}
