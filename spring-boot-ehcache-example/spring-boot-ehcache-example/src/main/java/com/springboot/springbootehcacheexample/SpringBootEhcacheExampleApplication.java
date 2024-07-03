package com.springboot.springbootehcacheexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching 
public class SpringBootEhcacheExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEhcacheExampleApplication.class, args);
	}

}
