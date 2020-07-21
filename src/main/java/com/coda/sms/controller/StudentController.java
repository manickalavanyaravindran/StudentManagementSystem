package com.coda.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coda.sms.dto.FacultyDTO;
import com.coda.sms.dto.LoginDTO;
import com.coda.sms.dto.StudentDTO;
import com.coda.sms.dto.StudentInfo;
import com.coda.sms.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	public StudentService service;
	@PostMapping("/login")
    public String loginValidation( @RequestBody LoginDTO dto) throws Exception 	{
		 return service.loginValidation(dto);
	}
	
	
	@GetMapping("/students/view/{userName}")
	public StudentDTO viewStudentDetail(@PathVariable("userName") String userName) {
		return service.viewStudentDetail(userName);
	}
	
	@GetMapping("/faculty/view/{userName}")
	public FacultyDTO viewFacultyDetail(@PathVariable("userName") String userName) {
		return service.viewFacultyDetail(userName);
	}
	
	@PutMapping("/students/update/")
	public String updateStudentInfo(@RequestBody StudentInfo student) {
		return service.updateStudentInfo(student);
	}
	

	@PutMapping("/faculty/update/")
	public String updateFacultyInfo(@RequestBody FacultyDTO faculty) {
		return service.updateFacultyDetail(faculty);
	}
	
	@PutMapping("/faculty/update/{userName}/{marks}")
	public String updateStudentMark(@PathVariable("userName") String userName,@PathVariable("marks") int marks) {
		return service.updateStudentMark(userName, marks);
	}
	@PutMapping("/faculty/update/studentdetail")
	public String updateStudentDetail(@RequestBody StudentInfo student) {
		return service.updateStudentInfo(student);
	}

}
