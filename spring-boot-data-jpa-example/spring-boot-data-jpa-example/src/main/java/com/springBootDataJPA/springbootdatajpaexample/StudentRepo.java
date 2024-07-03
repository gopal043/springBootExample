package com.springBootDataJPA.springbootdatajpaexample;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

//@NoRepositoryBean
public interface StudentRepo extends JpaRepository<Student, Long> {
	
	 //custom query example and return a stream
	  @Query("SELECT C FROM Student C WHERE C.name = :name")
	  @Transactional(readOnly = true)
      Stream<Student> findByNameReturnStream(@Param("name") String name);

}
