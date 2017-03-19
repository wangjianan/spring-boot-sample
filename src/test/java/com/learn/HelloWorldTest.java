
package com.learn;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.learn.hello.HelloWorld;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class HelloWorldTest {

	
	private MockMvc mockMvc;
	
	@Before
	public void before(){
		mockMvc = MockMvcBuilders.standaloneSetup(new HelloWorld()).build();
	}
	
	@Test
	public void testHello() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
		       .andExpect(status().isOk())
		       .andExpect(content().string("Hello World"));
	}
	
	@Test
	public void testHi() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/hi"))
	       .andExpect(status().isOk())
	       .andExpect(content().string("Hi !"));
	}
}
