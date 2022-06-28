package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	Long studentID;
	String studentName;
	int studentScore;
	
	public Long getStudentID() {
		return studentID;
	}
	public void setStudentID(Long studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentScore() {
		return studentScore;
	}
	public void setStudentScore(int studentScore) {
		this.studentScore = studentScore;
	}
	
	

}
