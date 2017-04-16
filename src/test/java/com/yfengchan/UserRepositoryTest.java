package com.yfengchan;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yfengchan.entity.User;
import com.yfengchan.service.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void testUserRepositoy(){
		User user = new User();
		user.setAge(20);
		user.setGender('0');
		user.setName("Sample1");
		userRepository.save(user);
		assertNotNull(userRepository.findByName("Sample1"));
		assertEquals(1, userRepository.findAll().size());
	}
}
