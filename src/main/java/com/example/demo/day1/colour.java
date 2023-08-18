package com.example.demo.day1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class colour {
 
	     @GetMapping("/colour")
	     public String c()
	     {
	    	 String colour="black";
	    	 return "Always "+colour;
	     }
}
