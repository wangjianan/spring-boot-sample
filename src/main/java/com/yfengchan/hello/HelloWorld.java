package com.yfengchan.hello;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;


@RestController
public class HelloWorld {
	
	@RequestMapping(value="/random",method=RequestMethod.GET)
	public Map<String, Object> randomData(){
		Map<String, Object> map = new HashMap<>();
		map.put("name", "name");
		map.put("age", "10");
		return map;
	}

	@ApiOperation(value="hello",notes="return hello world")
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public  String sayHello(){
		return "Hello World";
	}
	
	@ApiOperation(value="hi",notes="just say hi")
	@RequestMapping(value="/hi",method=RequestMethod.GET)
	public  String sayHi(){
		return "Hi !";
	}
	
	@ApiOperation(value="return the data what it pass in",notes="")
	@ApiImplicitParam(name="data",value="any string value",required=true,dataType="string")
	@RequestMapping(value="/returnAsIs/{data}",method=RequestMethod.GET)
	public String returnAsIs(@PathVariable String data){
		return data;
	}
	
}
