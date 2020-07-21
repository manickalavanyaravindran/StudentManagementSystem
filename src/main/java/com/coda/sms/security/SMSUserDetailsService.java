//package com.coda.sms.security;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import com.coda.sms.dto.StudentDTO;
//import com.coda.sms.entity.Student;
//import com.coda.sms.repository.StudentRepo;
//@Service
//public class SMSUserDetailsService implements UserDetailsService{
//	@Autowired
//	public StudentRepo srepo;
//	@Autowired
//    private PasswordEncoder passwordEncoder;
//	
//	public UserDetails loadUserByUsername(String username) {
//      Student stud = srepo.findByUserName(username);
//        if (stud == null) {
//            throw new UsernameNotFoundException(username);
//        }
//        StudentDTO  sdto = new StudentDTO();
//        sdto.setName(stud.getName());
//        sdto.setPassword(passwordEncoder.encode(stud.getPassword()));
//        sdto.setUserName(stud.getUserName());
//        List<String> userRoles=Arrays.asList("STUDENT");
//        return new SMSUserDetails(userRoles, sdto);
//    }
//
//}
