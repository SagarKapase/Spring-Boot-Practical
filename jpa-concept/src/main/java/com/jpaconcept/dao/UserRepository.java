package com.jpaconcept.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpaconcept.entities.User;

public interface UserRepository extends CrudRepository<User,Integer>{

}
