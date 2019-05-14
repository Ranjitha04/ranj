package com.student.models;

public class Student {

	private String usn;
	private String name;
	private String dob;
	private String course;
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
