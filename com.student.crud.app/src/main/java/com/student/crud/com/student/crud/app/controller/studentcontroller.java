package com.student.crud.com.student.crud.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.crud.com.student.crud.app.entity.student;
import com.student.crud.com.student.crud.app.service.studentservice;

@RestController
public class studentcontroller {
	@Autowired
	studentservice sr;
	
 @PostMapping("/add")
 public String checkDataFlow(@RequestBody student str) {
	 
	 sr.addstudent(str);
	 
	 return "response from student received";
 }
 //read
 @GetMapping("/get")
 public student getstudent(@RequestParam("roll") int roll) {
	student st = sr.getstudent(roll);
	return st;
 }
}
