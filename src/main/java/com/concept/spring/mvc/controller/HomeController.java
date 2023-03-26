package com.concept.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class HomeController {
	
	@GetMapping(value="/home")
	public String getHome() {
		return "Home.jsp";
	}
	@PostMapping(value="/registration")
	public void addCustomer(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String email) {
	    System.out.println("First name: "+firstName+"\nLast name: "+lastName+"\nEmail:"+email);
	}

}	
