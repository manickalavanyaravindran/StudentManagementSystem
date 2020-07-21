package com.coda.sms.entity;

import java.util.List;

import javax.persistence.*;


@Entity
public class Student {
	@Id
	@Column(name="username")
	private String userName;
	private String name;
	@Column(name="mailid")
	private String mailId;
	private String address;
	private String gender;
	private String password;
	private int marks;
		
	@OneToMany(targetEntity = Subject.class,cascade = CascadeType.ALL)
	@JoinColumn(name="StudentEnrolled", referencedColumnName = "userName")
	private List<Subject> subject;
	
	
	@OneToMany(targetEntity = Faculty.class,cascade = CascadeType.ALL, mappedBy = "student")
	private List<Faculty> faculty;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public List<Faculty> getFaculty() {
		return faculty;
	}
	public void setFaculty(List<Faculty> faculty) {
		this.faculty = faculty;
	}
	public List<Subject> getSubject() {
		return subject;
	}
	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	} 
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student() {
		
	}
	
	public Student(String userName, String name, String mailId, String address, String gender, String password,
			int marks, List<Subject> subject, List<Faculty> faculty) {
		super();
		this.userName = userName;
		this.name = name;
		this.mailId = mailId;
		this.address = address;
		this.gender = gender;
		this.password = password;
		this.marks = marks;
		this.subject = subject;
		this.faculty = faculty;
	}
	

}
