package com.learn.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloTemplate {

	@RequestMapping("/")
	public String indexPage(ModelMap modelMap){
		modelMap.addAttribute("index","index page");
		return "index";
	}
}
