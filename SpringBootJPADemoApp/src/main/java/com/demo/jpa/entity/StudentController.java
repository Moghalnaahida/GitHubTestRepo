package com.demo.jpa.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	StudentService studentservice;
	
	@PostMapping
	public Students setData(@RequestBody Students student) {
		studentservice.setData(student);
		return student;
	}
	
	@GetMapping
	public List<Students> getData() {
		return studentservice.getData();
		
	}

}
