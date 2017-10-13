package com.reallybigindex.docker.spring.boot.service;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService{

	private String currentTime = null;
	
	public HelloServiceImpl() {
		currentTime = new Date().toString();
		System.out.println("***** Creating HelloServiceImpl class object at: " + currentTime);
	}
	
	@Override
	public String getCurrentTime() throws Exception {
		return currentTime;
	}
	
	@Override
	public String getObjectCreationTime() throws Exception {
		
		if (currentTime == null) {
			currentTime = new Date().toString();
		}
		
		return currentTime;
	}
}