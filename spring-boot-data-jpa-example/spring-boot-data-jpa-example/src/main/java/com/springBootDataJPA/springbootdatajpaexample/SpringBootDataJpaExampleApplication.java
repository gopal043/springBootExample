package com.springBootDataJPA.springbootdatajpaexample;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringBootDataJpaExampleApplication implements CommandLineRunner{

	@Autowired
	private StudentRepo studentRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
        
		
		List<Student> studentData = studentRepo.findAll();
		
		studentData.forEach(System.out :: println);
		
		
		//Stream<Student> ss =studentRepo.findByNameReturnStream("GOPAL");
		//System.out.println(ss.toString());
		//ss.close();
		
		Student s = new Student();
		s.setId(12l);s.setAge(33);s.setName("SKY");s.setCity("HYD");
		//studentRepo.save(s);
	}
	
	

}
