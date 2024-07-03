package com.springboot.apachederbyexample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	public UserController() {
		super();
		System.out.println("UserController Constructor");
	}

	@Autowired    
	private UserService userService;     
	
	@RequestMapping("/")    
	public List<UserRecord> getAllUser()  
	{    
	return userService.getAllUsers();    
	}       
	
	@RequestMapping(value="/add-user", method=RequestMethod.POST)    
	public void addUser(@RequestBody UserRecord userRecord)  
	{    
	userService.addUser(userRecord);    
	}      
}
