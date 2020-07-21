package com.coda.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coda.sms.entity.Subject;

public interface SubjectRepo extends JpaRepository<Subject, Integer> {

}
