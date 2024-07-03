package com.springboot.springbootjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootJdbcController {

	@Autowired
	JdbcTemplate jdbc;

	@RequestMapping("/insert")
	public String index() {
		jdbc.execute("insert into sb_user(id,name,email)values(101,'javatpoint','java@javatpoint.com')");
		return "data inserted Successfully";
	}
}
