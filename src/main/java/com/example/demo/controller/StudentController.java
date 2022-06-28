package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.StudentRepo;
import com.example.demo.model.Student;



@RestController
public class StudentController {
	
	@Autowired
	StudentRepo repo;

	@GetMapping("students")
	public List<Student> getAllStudents(){
		return repo.findAll();
	}
	
	@PostMapping("student")
	public Optional<Student> addStudent(@RequestBody Student newStudent) {
		repo.save(newStudent);
		return repo.findById(newStudent.getStudentID());
	}
	
}
