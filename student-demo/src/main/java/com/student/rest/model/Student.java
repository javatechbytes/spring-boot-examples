package com.student.rest.model;

public class Student {
	private String admNumber;
	private String name;
	private String grade;
	public Student(String admNumber, String name, String grade) {
		super();
		this.admNumber = admNumber;
		this.name = name;
		this.grade = grade;
	}
	public String getAdmNumber() {
		return admNumber;
	}
	public void setAdmNumber(String admNumber) {
		this.admNumber = admNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [admNumber=" + admNumber + ", name=" + name + ", grade=" + grade + "]";
	}
	
	
}
