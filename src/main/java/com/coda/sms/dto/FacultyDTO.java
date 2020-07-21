package com.coda.sms.dto;
import java.util.List;

import com.coda.sms.entity.Faculty;
import com.coda.sms.entity.Student;
import com.coda.sms.entity.Subject;



public class FacultyDTO {
	private String userName;
	private String name;
	private String mailId;
	private String address;
	private String gender;
	private String password;
	private List<Subject> subject;
	private Student student;
	
	public FacultyDTO() {
	
	}
	
	public FacultyDTO(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public FacultyDTO(String name, String mailId, String address, String gender, List<Subject> subject,
			Student student) {
		super();
		this.name = name;
		this.mailId = mailId;
		this.address = address;
		this.gender = gender;
		this.subject = subject;
		this.student = student;
	}

	public FacultyDTO(String userName, String name, String mailId, String address, String gender, String password,
			List<Subject> subject,Student student) {
		super();
		this.userName = userName;
		this.name = name;
		this.mailId = mailId;
		this.address = address;
		this.gender = gender;
		this.password = password;
		this.subject = subject;
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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
	public List<Subject> getSubject() {
		return subject;
	}
	public void setSubject(List<Subject> subject2) {
		this.subject = subject2;
	}

	@Override
	public String toString() {
		return "FacultyDTO [userName=" + userName + ", name=" + name + ", mailId=" + mailId + ", address=" + address
				+ ", gender=" + gender + ", password=" + password + ", subject=" + subject + ", getuserName()="
				+ getUserName() + ", getName()=" + getName() + ", getMailId()=" + getMailId() + ", getAddress()="
				+ getAddress() + ", getGender()=" + getGender() + ", getPassword()=" + getPassword() + ", getSubject()="
				+ getSubject() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public static Faculty prepareToEntity(FacultyDTO fdto) {
		Faculty faculty = new Faculty();
		faculty.setUserName(fdto.getUserName());
		faculty.setName(fdto.getName());
		faculty.setMailId(fdto.getMailId());
		faculty.setGender(fdto.getGender());
		faculty.setAddress(fdto.getAddress());
		faculty.setPassword(fdto.getPassword());
		faculty.setSubject(fdto.getSubject());
		faculty.setStudent(fdto.getStudent());
		return faculty;
	}
	
	

}
