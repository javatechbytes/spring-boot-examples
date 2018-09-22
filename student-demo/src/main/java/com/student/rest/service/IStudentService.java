package com.student.rest.service;

import java.util.List;

import com.student.rest.model.Student;

public interface IStudentService {
	List<Student> getAllStudents();

	void addStudent(Student student);

}
