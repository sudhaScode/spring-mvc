package com.concept.spring.mvc.controller;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ErrorController01 implements ErrorController{
	    private final static String PATH = "/error";
	    @GetMapping(PATH)
	    public String getErrorPath() {
	        // TODO Auto-generated method stub
	        return "No Mapping Found";
	    }

	}
