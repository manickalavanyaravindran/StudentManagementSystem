package com.coda.sms.dto;

import java.util.List;

import com.coda.sms.entity.Faculty;
import com.coda.sms.entity.Student;
import com.coda.sms.entity.Subject;

public class StudentDTO {
	private String userName;
	
	private String name;
	private String mailId;
	private String address;
	private String gender;
	private String password;
	private int marks;
	private List<Subject> subject;
	private List<Faculty> faculty;
	
	public StudentDTO() {
	}
	
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<Subject> getSubject() {
		return subject;
	}
	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public List<Faculty> getFaculty() {
		return faculty;
	}



	public void setFaculty(List<Faculty> faculty) {
		this.faculty = faculty;
	}



	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentDTO [userName=" + userName + ", name=" + name + ", mailId=" + mailId + ", address=" + address
				+ ", gender=" + gender + ", password=" + password + ", marks=" + marks + "]";
	}
	
	
	public StudentDTO(String userName, String name, String mailId, String address, String gender, String password,
			int marks, List<Subject> subject) {
		super();
		this.userName = userName;
		this.name = name;
		this.mailId = mailId;
		this.address = address;
		this.gender = gender;
		this.password = password;
		this.marks = marks;
		this.subject = subject;
		}



	public static  StudentDTO prepareDTO(Student student) {
		StudentDTO studentDTO= new StudentDTO();
		studentDTO.setName(student.getName());
		studentDTO.setUserName(student.getUserName());
		studentDTO.setAddress(student.getAddress());
		studentDTO.setMailId(student.getMailId());
		studentDTO.setGender(student.getGender());
		studentDTO.setMarks(student.getMarks());
		studentDTO.setSubject(student.getSubject());
		
		return studentDTO;
	}
	
	public static Student   prepareEntity( StudentDTO student) {
		Student studentEntity= new Student();
		studentEntity.setName(student.getName());
		studentEntity.setUserName(student.getUserName());
		studentEntity.setAddress(student.getAddress());
		studentEntity.setMailId(student.getMailId());
		studentEntity.setGender(student.getGender());
		studentEntity.setPassword(student.getPassword());
		studentEntity.setMarks(student.getMarks());
		studentEntity.setSubject(student.getSubject());
		return studentEntity;
	}
	
	

}
