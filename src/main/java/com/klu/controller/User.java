package com.klu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class User {

	 @GetMapping("/user")
	    public String homePage() {
	        return "Welcome to Home!";
	    }
	
}
