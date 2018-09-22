package com.student.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;

	@GetMapping("/students")
	@ResponseBody
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@PostMapping("/students")
	@ResponseBody
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}

	@DeleteMapping("/students/{studentId}")
	@ResponseBody
	public void deleteStudent(@PathVariable("studentId") String studentId) {
		studentService.deleteStudent(studentId);
	}

	@PutMapping("/students")
	@ResponseBody
	public void updateStudent(@RequestBody Student studentId) {
		studentService.updateStudent(studentId);
	}
}
