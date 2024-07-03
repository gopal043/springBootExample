package com.springboot.springbooth2databaseexample;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Id> {

}
