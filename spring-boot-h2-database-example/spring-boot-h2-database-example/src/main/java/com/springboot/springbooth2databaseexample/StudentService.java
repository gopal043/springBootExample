package com.springboot.springbooth2databaseexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	 StudentRepository studentRepository;
	 
	public List<Student> getAllStudent(){
		
		List<Student> studentList= new ArrayList<Student>();
		
		studentRepository.findAll().forEach(studentList :: add);
		
		//studentRepository.findAll().forEach(student -> studentList.add(student));
		
		return studentList;
	}
	
	public Optional<Student> getStudentById(Id id){
		
		return studentRepository.findById(id);
		
	}
	
	public void saveStudent(Student entity){
		studentRepository.save(entity);
	}
	
	public void deleteStudent(Id id){
		studentRepository.deleteById(id);
	}

}
