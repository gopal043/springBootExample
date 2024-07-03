package com.springboot.springboothelloworldexample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	public HelloWorldController() {
		super();
		System.out.println("HelloWorldController contructor");
	}

	@RequestMapping("/")
	public String hello() {
		
		System.out.println("hello()");
		return "Hello javaTpoint";
	}
}