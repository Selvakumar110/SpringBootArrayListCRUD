package com.student.controller;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.Model.Student;
import com.student.service.StudentService;


@RequestMapping("management")
@RestController
public class StudentController {
	@Autowired
	StudentService studentservice;
//	@PostMapping(path="create" ,consumes = "application/xml", produces = "application/xml") /to write in xml 
	@PostMapping("create")
	public Student create(@RequestBody Student student) {
		System.out.println(student);
		return studentservice.create(student);
		
	}
	
	@GetMapping("getall")
	public ArrayList<Student>getall(){
		return studentservice.getall();
	}

	
	
	@GetMapping("get/{rollno}")
	public void get(@PathVariable("rollno")int rollno ) {
		 studentservice.get(rollno);
	}

	
	@DeleteMapping("delete/{rollno}")
	public void delete(@PathVariable("rollno")int student) {
		studentservice.delete(student);
	} 
	

	
	@PostMapping("update/{rollno}")
	public void update(@PathVariable("rollno")int rollno,@RequestBody Student student) {
		studentservice.update(rollno,student);
	}
	}