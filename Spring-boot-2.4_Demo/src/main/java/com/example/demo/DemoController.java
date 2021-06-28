package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	private final DemoService demoService;
	
	public DemoController(DemoService demoService) {
		super();
		this.demoService = demoService;
	}

	public String hello() {
		return demoService.go();
	}

}
