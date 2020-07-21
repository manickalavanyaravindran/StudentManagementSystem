package com.coda.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coda.sms.entity.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, String>{
      public Student findByUserName(String userName);
      public Student findByUserNameAndPassword(String userName,String password);
}
