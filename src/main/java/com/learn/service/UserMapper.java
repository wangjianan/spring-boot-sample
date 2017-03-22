package com.learn.service;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.learn.entity.User;

@Mapper
public interface UserMapper {

	
	@Select("select * from user where id = #{id}")
	public User findById(@Param("id")long id);

	@Select("select * from user where name = #{name}")
	public User findByName(String name);
	
	@Options(useGeneratedKeys=true, keyProperty="id")
	@Insert("insert into user(name,age,gender) values (#{name},#{age},#{gender})")
	public int insert(@Param("name")String name,@Param("age")Integer age,@Param("gender")Integer gender);
}
