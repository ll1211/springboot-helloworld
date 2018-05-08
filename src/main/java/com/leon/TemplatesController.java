package com.leon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/templates")
public class TemplatesController {

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
}
