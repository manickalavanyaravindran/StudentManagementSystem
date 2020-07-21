package com.coda.sms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Subject {
	@Id
	@GeneratedValue()
	private int id;
	@Column(name="subjectname")
	private String subjectName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public Subject(String subjectName) {
		super();
		this.subjectName = subjectName;
	}
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	

}
