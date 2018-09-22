package com.student.rest.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private String admNumber;
	private String name;
	private String grade;

	public Student() {
	}

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((admNumber == null) ? 0 : admNumber.hashCode());
		result = prime * result + ((grade == null) ? 0 : grade.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (admNumber == null) {
			if (other.admNumber != null)
				return false;
		} else if (!admNumber.equals(other.admNumber))
			return false;
		if (grade == null) {
			if (other.grade != null)
				return false;
		} else if (!grade.equals(other.grade))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
