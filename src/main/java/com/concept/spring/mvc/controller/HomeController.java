package com.concept.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.concept.spring.mvc.controller.model.Customer;



@Controller
public class HomeController{
	
	@Autowired
	CustomerRepository repo;
	
	@GetMapping(value="/")
	public String getHome() {
		return "Home.jsp";
	}
	@PostMapping(value="/registration") //without database
	public String addCustomer(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String email, Model model) {
	    model.addAttribute("firstName",firstName);
	    model.addAttribute("lastName", lastName);
	    model.addAttribute("email", email);
	    return "userdata.jsp";
	}
	/*@PostMapping(value="/registration") //with database
	public String addCustomer(Customer data, Model model) {
	   repo.save(data);	
	   model.addAttribute("data", repo.findAll());
      return "userdata.jsp";
	}*/	

}
