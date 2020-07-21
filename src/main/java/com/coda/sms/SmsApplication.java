package com.coda.sms;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.coda.sms.dto.FacultyDTO;
import com.coda.sms.dto.StudentDTO;
import com.coda.sms.entity.Faculty;
import com.coda.sms.entity.Student;
import com.coda.sms.entity.Subject;
import com.coda.sms.repository.FacultyRepo;
import com.coda.sms.repository.StudentRepo;
import com.coda.sms.service.StudentService;

@SpringBootApplication
public class SmsApplication {
 @Autowired
 public StudentService service;
	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext=SpringApplication.run(SmsApplication.class, args);
		StudentRepo srepo= configurableApplicationContext.getBean(StudentRepo.class);
		FacultyRepo frepo= configurableApplicationContext.getBean(FacultyRepo.class);
		
		Subject s1= new Subject("Economic");
		Subject s2=new Subject("Math");
		List<Subject> subject=Arrays.asList(s1,s2);
		StudentDTO sdto= new StudentDTO("S1001", "Coda", "coda123@gmail.com", "Chennai", "Male", "coda123",478, subject);
		Student student1=StudentDTO.prepareEntity(sdto);
		srepo.saveAndFlush(student1);
		
		FacultyDTO fdto=new FacultyDTO("F101", "Global","global123@gmail.com","Chennai", "Female","global123",subject,student1);
		Faculty faculty=FacultyDTO.prepareToEntity(fdto);
		frepo.saveAndFlush(faculty);
	}

}
