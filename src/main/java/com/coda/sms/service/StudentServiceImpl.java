package com.coda.sms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coda.sms.dto.FacultyDTO;
import com.coda.sms.dto.LoginDTO;
import com.coda.sms.dto.StudentDTO;
import com.coda.sms.dto.StudentInfo;
import com.coda.sms.entity.Faculty;
import com.coda.sms.entity.Student;
import com.coda.sms.repository.FacultyRepo;
import com.coda.sms.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService
{
   @Autowired
   public StudentRepo srepo;
   @Autowired
   public FacultyRepo frepo;
   
	@Override
	public StudentDTO viewStudentDetail(String userName) {
		Student student= srepo.findByUserName(userName);
		return StudentDTO.prepareDTO(student);
	}

	@Override
	public FacultyDTO viewFacultyDetail(String userName) {
		Faculty faculty=frepo.findByUserName(userName);
		FacultyDTO fdto=new FacultyDTO(faculty.getName(), faculty.getMailId(),faculty.getAddress(), faculty.getGender(), faculty.getSubject(),
				faculty.getStudent());
		
		return fdto;
	}
	
	@Override
	public String updateStudentInfo(StudentInfo student) {
		String userName=student.getUserName();
	
	Student updateStud	= srepo.findByUserName(userName);
		if(updateStud != null ) {
			updateStud.setAddress(student.getAddress());
			updateStud.setGender(student.getGender());
			updateStud.setMailId(student.getMailId());
			updateStud.setPassword(student.getPassword());
			updateStud.setSubject(student.getSubject());
			return "Records are updated";
		}else
			return "No such student record found";
	}
	@Override
	 public String updateFacultyDetail(FacultyDTO faculty) {
		Faculty updateFaculty=frepo.findByUserName(faculty.getUserName());
		if(updateFaculty != null) {
			updateFaculty.setAddress(faculty.getAddress());
			updateFaculty.setGender(faculty.getGender());
			updateFaculty.setMailId(faculty.getMailId());
			updateFaculty.setPassword(faculty.getPassword());
			updateFaculty.setStudent(faculty.getStudent());
			updateFaculty.setSubject(faculty.getSubject());
			return "Records are updated";
		}return "No such faculty found";
	}
	@Override
	 public String updateStudentMark(String userName,int marks) {
		Student updateStud	= srepo.findByUserName(userName);
		if(updateStud != null) {
			updateStud.setMarks(marks);
			return "Marks were updated";
		}
		
		return "No such student Found";}
	
	
	@Override
	public String loginValidation(LoginDTO dto) throws Exception{
		String userName=dto.getUserName();
		char first_char=userName.charAt(0);
		switch(first_char) {
		case 'S':{
			if (srepo.findByUserNameAndPassword(dto.getUserName(), dto.getPassword())== null){
                throw new Exception("User not Found");
            }
			return "Login Successfully";}
		
		case 'F':{
			if (frepo.findByUserNameAndPassword(dto.getUserName(), dto.getPassword())== null){
                throw new Exception("User not Found");
            }
			return "Login Successfully";}
		default: 
			return null;
		}
		
		}

	@Override
	public String deleteStudentRecord(String userName) {
		Student student	= srepo.findByUserName(userName);
		if (student != null) {
			srepo.delete(student);
			return "Record deleted ";
		}
		return "No record is found to delete";
	}
	


	

	


		
	
	

}
