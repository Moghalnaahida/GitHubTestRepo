package com.demo.jpa.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public Students setData(Students student) {
		studentRepository.save(student);
		return student;
		
	}
	public List<Students> getData() {
		return studentRepository.findAll();
		
		
	}

}
