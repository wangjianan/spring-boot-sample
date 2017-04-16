package com.yfengchan.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yfengchan.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByName(String name);
	
	User findByAge(Integer age);

}
