package com.springboot.apachederbyexample;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserRecord, Id> {

}
