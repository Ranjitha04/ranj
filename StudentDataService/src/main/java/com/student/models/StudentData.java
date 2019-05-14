package com.student.models;

public class StudentData {

	
	private String usn;
	private String name;
	private String course;
	private int marks;
	private String result;
	
    public static final int MAX_MARKS = 6000;
    public static final int PASSING_SCORE = 2500;
    
   
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	
}
