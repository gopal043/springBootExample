package com.springBootJPA.springbootjpaexample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springBootJPA.entities.ContactsMasterEntity;
import com.springBootJPA.entities.Emp;
import com.springBootJPA.repository.ContactsMasterRepo;

@SpringBootApplication
//@ComponentScan(basePackages="com.*")
public class SpringBootJpaExampleApplication implements CommandLineRunner{

	//@Autowired
	//private ContactsMasterRepo repo;
	
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootJpaExampleApplication.class, args);
		/*ConfigurableApplicationContext context=
				SpringApplication.run(SpringBootJpaExampleApplication.class, args);
		
		 System.out.println("line 20 "+context.containsBean("contactsMasterRepo"));
		 System.out.println("line 21 "+context.getBeanFactory());
		 System.out.println("line 22 "+context.getBeanNamesForType(ContactsMasterRepo.class));
		 System.out.println("line 23 "+context.getBean("contactsMasterRepo", ContactsMasterRepo.class));

		 ContactsMasterRepo bean=context.getBean(ContactsMasterRepo.class);
		
		 System.out.println("line 17"+bean);

		ContactsMasterEntity entity=new ContactsMasterEntity();
		System.out.println("line 20"+entity);

		entity.setContactid(1);
		entity.setContactName("charles");
		entity.setContactNumber(8886457l);
		
		bean.save(entity);
		
		context.close(); 
		*/
	}

	@Override
	public void run(String... args) throws Exception {
		
		//repo.save(new ContactsMasterEntity(1,"rohit",12345l));
		String sql="select * from emp99";
	      List<Emp> emp= jdbctemplate.query(sql, BeanPropertyRowMapper.newInstance(Emp.class));
	      
	      for(Emp e:emp){
	    	  System.out.println(e.toString());
	      }
	}

}
