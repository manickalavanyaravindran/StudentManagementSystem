package com.coda.sms.dto;

import java.util.List;
import com.coda.sms.entity.Student;
import com.coda.sms.entity.Subject;

public class StudentInfo {
    
	private String userName;
	private String mailId;
	private String address;
	private String gender;
	private String password;
	private List<Subject> subject;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public List<Subject> getSubject() {
		return subject;
	}
	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}
	
	public StudentInfo(String userName, String mailId, String address, String gender, String password,
			List<Subject> subject ) {
		super();
		this.userName = userName;
		
		this.mailId = mailId;
		this.address = address;
		this.gender = gender;
		this.password = password;
		this.subject = subject;
		
	}
	
	public StudentInfo(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public StudentInfo() {
		super();
	}
	@Override
	public String toString() {
		return "StudentInfo [userName=" + userName + ",  mailId=" + mailId + ", address=" + address
				+ ", gender=" + gender + ", password=" + password + ", subject=" + subject +  "]";
	}
	
	public static  StudentInfo  prepareDTO(Student student) {
		StudentInfo  studentInfo = new StudentInfo ();
		studentInfo.setUserName(student.getUserName());
		studentInfo.setAddress(student.getAddress());
		studentInfo.setMailId(student.getMailId());
		studentInfo.setGender(student.getGender());
		studentInfo.setSubject(student.getSubject());
		studentInfo.setPassword(student.getPassword());
		return studentInfo;
	}
	
	public static Student   prepareEntity( StudentInfo student) {
		Student studentEntity= new Student();
		studentEntity.setUserName(student.getUserName());
		studentEntity.setAddress(student.getAddress());
		studentEntity.setMailId(student.getMailId());
		studentEntity.setGender(student.getGender());
		studentEntity.setPassword(student.getPassword());
		studentEntity.setSubject(student.getSubject());
		return studentEntity;
	}
	

}
