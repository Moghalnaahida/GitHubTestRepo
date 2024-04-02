package com.jpa.entity;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.jpa.entity.Students;

@RestController
public class StudControl {
	@Autowired
	StudRegisterService studRegisterService;
	
	
	@PostMapping
	public  StudentDemo setData(@RequestBody StudentDemo studentdemo) {
		studRegisterService.setData(studentdemo);
		return studentdemo;
	}
	@GetMapping
	public List<StudentDemo> getData(){
		return studRegisterService.getData();
		
	}
	@GetMapping
	public Optional<StudentDemo> getById(@PathVariable Long id){
		return studRegisterService.getById(id);
		
	}

}
