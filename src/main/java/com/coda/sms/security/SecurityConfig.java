//package com.coda.sms.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//	 
//		@Autowired
//		private SMSUserDetailsService userDetailsService;
//	@Autowired
//	public void configGlobal(AuthenticationManagerBuilder auth) throws Exception{
//     	auth.userDetailsService(userDetailsService);
//			
//		
//	}
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//			.authorizeRequests()
//     		.antMatchers("/admin").hasRole("ADMIN")
//     		.antMatchers("/faculty").hasAnyRole("ADMIN","FACULTY")
//     		.antMatchers("/student").hasAnyRole("ADMIN","STUDENT","FACULTY")
//     		.antMatchers("/").permitAll()
//			.and().formLogin();
//	
////		http.authorizeRequests().antMatchers("/**").hasAnyRole("STUDENT", "FACULTY")
////
////		.anyRequest().authenticated()
////
////		.and().formLogin();
//	}
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//	    return new BCryptPasswordEncoder();
//	}
//}
