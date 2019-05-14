package com.student.details.personal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@Column(name="USN", unique=true, length = 10)
	private String usn;
	@Column(name="Student_Name", length = 20)
	private String name;
	@Column(name="Student_DOB", length = 15)
	private String dob;
	@Column(name="Student_Course", length = 20)
	private String course;
	@Column(name="Student_Contact", unique=true, length = 12)
	private String contactNo;
	
	
	public Student() {
		
	}
	
	public Student(String usn, String name, String dob, String course) {
		super();
		this.usn = usn;
		this.name = name;
		this.dob = dob;
		this.course = course;
	}
	
	
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
}
