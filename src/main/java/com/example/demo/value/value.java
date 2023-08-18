package com.example.demo.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class value {

	@Value("115")
	public int regno;
	@Value("Madhangi")
	public String name;
	
    @RequestMapping("display")
	public String display()
	{
		return "Name " + name +" Regno "+regno;
	}
}
