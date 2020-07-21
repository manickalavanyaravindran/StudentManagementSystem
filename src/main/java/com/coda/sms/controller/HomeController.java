package com.coda.sms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String home() {

		return ("<h1>Welcome to SMS</h1>");
	}


	@GetMapping("/student")
	public String student() {

		return ("<h1>Welcome to Student Portal</h1>");
	}	
	@GetMapping("/faculty")
	public String faculty() {

		return ("<h1>Welcome to Faculty Portal</h1>");
	}	
	
	@GetMapping("/admin")
	public String admin() {

		return ("<h1>Welcome to Admin Portal</h1>");
	}	
}
