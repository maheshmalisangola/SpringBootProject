package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class WebdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebdemoApplication.class, args);
		System.out.println("hello mahesh");
	}
	    @RequestMapping("/hello")
	    @ResponseBody
	    String home() {
	      return "Hello World!";
	      
	    }

	
	}

