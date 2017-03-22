package com.learn;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.learn.entity.User;
import com.learn.service.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testFindByName(){
		userMapper.insert("AA", 20, 0);
		User user = userMapper.findByName("AA");
		Assert.assertEquals(Integer.valueOf("20"), user.getAge());
	}
}
