package com.learn.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloWorld {

	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public @ResponseBody String sayHello(){
		return "Hello World";
	}
	
	@RequestMapping(value="/hi",method=RequestMethod.GET)
	public @ResponseBody String sayHi(){
		return "Hi !";
	}
	
}
