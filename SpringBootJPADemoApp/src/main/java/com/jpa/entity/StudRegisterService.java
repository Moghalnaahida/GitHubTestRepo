package com.jpa.entity;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.jpa.entity.Students;

@Service
public class StudRegisterService {
	
	@Autowired
	StudentRegister studentRegister;
	
	public StudentDemo setData(StudentDemo studentdemo) {
		return studentRegister.save(studentdemo);
			
	}
	public List<StudentDemo> getData(){
		return studentRegister.findAll();
	
	}
	public Optional<StudentDemo> getById(Long id){
		return studentRegister.findById(id);
	}
	

}
