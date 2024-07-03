package com.springboot.springbooth2databaseexample;

import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/student")
	public List<Student> getAllStudents(){
		
		return studentService.getAllStudent();
		
	}
	
	@PostMapping("/student/{id}")
	public Optional<Student> getStudentById(@PathVariable("id") Id id){
		return studentService.getStudentById(id);
	}
	
	@PostMapping("/student")
	public int saveStudent(@RequestBody Student student){
		studentService.saveStudent(student);
		return student.getId();
		
	}
	
	@DeleteMapping("/student/{id}")
	public void deleteStudent(@PathVariable Id id){
		studentService.deleteStudent(id);
	}

}
