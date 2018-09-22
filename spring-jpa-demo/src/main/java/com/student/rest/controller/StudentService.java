package com.student.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	public List<Student> getAllStudents() {
		Iterable<Student> iterable = studentRepository.findAll();
		List<Student> students = new ArrayList<>();
		iterable.forEach(students::add);
		return students;
	}

	public void addStudent(Student student) {
		studentRepository.save(student);
		System.out.println("Created:" + student);
	}
	
	public void updateStudent(Student student) {
		studentRepository.save(student);
		System.out.println("Updated: "+student);
	}
	
	public void deleteStudent(String studentId) {
		studentRepository.deleteById(studentId);
		System.out.println("Deleted: "+studentId);
	}
}
