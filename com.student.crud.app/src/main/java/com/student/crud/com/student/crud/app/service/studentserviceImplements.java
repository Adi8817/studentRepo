package com.student.crud.com.student.crud.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.crud.com.student.crud.app.entity.student;
import com.student.crud.com.student.crud.app.repository.studentrepository;
@Service
public class studentserviceImplements implements studentservice {
	@Autowired
	studentrepository rp;
	
	public void addstudent(student str) {
		rp.save(str);
	}
	public student getstudent(int roll) {
		student st= rp.findById(roll).get();
		return st;
		
	}

}
