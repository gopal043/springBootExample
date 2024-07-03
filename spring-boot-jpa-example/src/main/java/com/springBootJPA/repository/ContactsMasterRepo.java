package com.springBootJPA.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springBootJPA.entities.ContactsMasterEntity;

//@EnableJpaRepositories
//@Repository(value="contactsMasterRepo")
public interface ContactsMasterRepo extends CrudRepository<ContactsMasterEntity, Serializable>{

}
