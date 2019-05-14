package com.student.data;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.student.models.Academics;
import com.student.models.Student;
import com.student.models.StudentData;


@RestController
public class StudentDataController {

	@GetMapping("/student/{usn}")
	public StudentData getDetails(@PathVariable String usn) {
		
		 RestTemplate restTemplate = new RestTemplate(); Student student =
		 restTemplate.getForObject("http://localhost:8081/personal/student/"+usn,
		 Student.class);
		 Academics academics =
		 restTemplate.getForObject("http://localhost:8085/academics/details/"+usn,
		 Academics.class);
		  
		 StudentData data = new StudentData(); data.setUsn(usn);
		 data.setName(student.getName()); data.setCourse(student.getCourse());
		 data.setMarks(academics.getAggregate_marks()); data.setResult(result(student,
		 academics, data));
		  
		 return data;

	}

	private String result(Student student, Academics academics, StudentData data) {
		// TODO Auto-generated method stub
		String result = "FAIL";
		if((StudentData.MAX_MARKS - academics.getAggregate_marks()) <= StudentData.PASSING_SCORE) {
			result = "PASS";return result;
		}	 
		else return result;
	}

	
}
