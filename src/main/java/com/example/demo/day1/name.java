package com.example.demo.day1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class name {

	    @GetMapping("/name")
	    public String n()
	    {
	    String name="Have a nice day:)";
	    return name;
	    }
}
