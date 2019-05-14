package com.student.models;

public class Academics {

	private String usn;
	private int year1;
	private int year2;
	private int year3;
	private int year4;
	private int aggregate_marks;
	
	
	
	public void setAggregate_marks(int aggregate_marks) {
		this.aggregate_marks = aggregate_marks;
	}

	public Academics() {
		
	}
	
	public Academics(String usn, int year1, int year2, int year3, int year4) {
		super();
		this.usn = usn;
		this.year1 = year1;
		this.year2 = year2;
		this.year3 = year3;
		this.year4 = year4;
		this.aggregate_marks = (year1 + year2 + year3 + year4);
	}

	public String getUsn() {
		return usn;
	}

	public void setUsn(String usn) {
		this.usn = usn;
	}

	public int getYear1() {
		return year1;
	}

	public void setYear1(int year1) {
		this.year1 = year1;
	}

	public int getYear2() {
		return year2;
	}

	public void setYear2(int year2) {
		this.year2 = year2;
	}

	public int getYear3() {
		return year3;
	}

	public void setYear3(int year3) {
		this.year3 = year3;
	}

	public int getYear4() {
		return year4;
	}

	public void setYear4(int year4) {
		this.year4 = year4;
	}

	public int getAggregate_marks() {
		return aggregate_marks;
	}
}
