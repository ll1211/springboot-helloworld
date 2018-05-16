package com.leon;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/templates")
public class TemplatesController {

	@RequestMapping("/hello")
	public String hello(Map<String,Object> map) {
		map.put("name", "leon");
		return "hello";
	}
	
	@RequestMapping("/helloFtl")
	public String helloFtl() {
		return "helloFtl";
	}
}
