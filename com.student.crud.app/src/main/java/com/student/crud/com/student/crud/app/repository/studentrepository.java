package com.student.crud.com.student.crud.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.crud.com.student.crud.app.entity.student;

public interface studentrepository extends JpaRepository<student,Integer>{
	
}


