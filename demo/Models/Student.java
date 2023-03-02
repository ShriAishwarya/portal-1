package com.example.demo.Models;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
	private String studentName;
	private String departmenName;
	private String mailid;
	public Student(int id, String studentName, String departmenName, String mailid) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.departmenName = departmenName;
		this.mailid = mailid;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDepartmenName() {
		return departmenName;
	}
	public void setDepartmenName(String departmenName) {
		this.departmenName = departmenName;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	

}
