package com.example.demo.application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class application {
        @Value(value="${myName}")
        public String studentName;
        @Value(value="${age:18}")
        public int age;
        @GetMapping("/student")
        public String displayStudent()
        {
        	return "My name is "+studentName+" Age is "+age;
        }
}
