package com.student.rest.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.student.rest.controller","com.student.rest.service"})
public class StudentApplication {

	public static void main(String[] args) {
		  SpringApplication.run(StudentApplication.class, args);
	}

}
