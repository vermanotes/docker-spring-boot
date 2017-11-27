package com.reallybigindex.docker.spring.boot.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping
	@RequestMapping("/")
	public String getWelcome() {
		System.out.println("***** GET / API at:" + new Date());
		return "Welcome!";
	}
	
	@GetMapping
	@RequestMapping("/hello")
	public String getHello() {
		System.out.println("***** GET /hello API at:" + new Date());
		return "Hello there!";
	}
}
