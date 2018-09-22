package com.student.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.student.rest.model.Student;

@Component
public class StudentService implements IStudentService {
	private static List<Student> students = new ArrayList<>();
	static {
		students.add(new Student("1", "kumar", "MCA"));
	}
	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	 

	@Override
	public void addStudent(Student student) {
		System.out.println(student);
		students.add(student);		
	}

	 
}
