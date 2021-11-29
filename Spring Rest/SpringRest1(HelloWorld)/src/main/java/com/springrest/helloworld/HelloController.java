package com.springrest.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello()
	{
	return "Hello World Rest 1 Qustion";
	}
}
