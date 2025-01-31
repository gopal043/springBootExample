package com.springboot.springbootcacheexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootCacheExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCacheExampleApplication.class, args);
	}

}
