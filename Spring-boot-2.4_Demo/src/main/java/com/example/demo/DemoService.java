package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

	public DemoService(WaitProperties properties) throws InterruptedException {
		System.out.println(properties.forTime().toMillis());
		Thread.sleep(properties.forTime().toMillis());
	}

	public String go() {		
		return "Hello world";
	}

}
