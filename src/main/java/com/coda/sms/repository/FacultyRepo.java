package com.coda.sms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coda.sms.entity.Faculty;
import com.coda.sms.entity.Student;
@Repository
public interface FacultyRepo extends JpaRepository<Faculty, String> {
	public Faculty findByUserName(String userName);
	public Faculty findByUserNameAndPassword(String userName,String password);
	public List	<Student> findByStudent(Student student);
}
