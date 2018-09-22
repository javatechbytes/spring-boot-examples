package com.student.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.rest.model.Student;
import com.student.rest.service.IStudentService;

@RestController
public class StudentController {
	@Autowired
	IStudentService studentService;

	 @GetMapping("/students")
	 @ResponseBody
	 public List<Student> getAllStudents(){
		 return studentService.getAllStudents();
	 }
	 
	 
	 @PostMapping("/students")
	 @ResponseBody
	 public void addStudent(@RequestBody Student student){
		 studentService.addStudent(student);
	 }
}
