package com.coda.sms.service;

import com.coda.sms.dto.FacultyDTO;
import com.coda.sms.dto.LoginDTO;
import com.coda.sms.dto.StudentDTO;
import com.coda.sms.dto.StudentInfo;

public interface StudentService {
 public StudentDTO viewStudentDetail(String userName);
 public FacultyDTO viewFacultyDetail(String userName);
 public String loginValidation(LoginDTO dto) throws Exception;	
 public String updateStudentInfo(StudentInfo student);
 public String updateStudentMark(String userName,int marks);
 public String updateFacultyDetail(FacultyDTO faculty); 
 public String deleteStudentRecord(String userName); 	
}
