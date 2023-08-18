package com.example.demo.day1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	    @GetMapping("/welcome")
	    public String welcome()
	    {
	    	return "Welcome to Springboot";
	    }
}

