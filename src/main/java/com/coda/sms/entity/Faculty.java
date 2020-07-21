
package com.coda.sms.entity;

import java.util.List;

import javax.persistence.*;


@Entity
public class Faculty {
	@Id
	@Column(name="username")
	private String userName;
	private String name;
	@Column(name="mailid")
	private String mailId;
	private String address;
	private String gender;
	private String password;
	
	@OneToMany(targetEntity = Subject.class,cascade = CascadeType.ALL)
	@JoinColumn(name="Faculty", referencedColumnName = "userName")
	private List<Subject> subject;
	
	@ManyToOne(targetEntity = Student.class,cascade = CascadeType.ALL)
	@JoinColumn(name="student")
	private Student student;
	
	
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
	
	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}
	
	
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Faculty [userName=" + userName + ", name=" + name + ", mailId=" + mailId + ", address=" + address
				+ ", gender=" + gender + ", password=" + password + ", subject=" + subject + ", student=" + student
				+ "]";
	}
	public Faculty() {
	}
	public Faculty(String userName, String name, String mailId, String address, String gender, String password,
			List<Subject> subject, Student student) {
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
	
	
	 
}
