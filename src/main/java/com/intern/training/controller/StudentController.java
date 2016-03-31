package com.intern.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.intern.training.api.StudentManager;
import com.intern.training.api.domain.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentManager studentManager;

	@RequestMapping(value="/testing",method=RequestMethod.GET) 
	public String getStringValue() {
		return "will it sdasdfasdfe";
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Student> findAll(){
		return this.studentManager.findAll();
	}
	
}
