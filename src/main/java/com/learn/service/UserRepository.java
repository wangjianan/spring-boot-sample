package com.learn.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByName(String name);
	
	User findByAge(Integer age);

}
