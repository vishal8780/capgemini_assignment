package com.vishal.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;  
//Controller  
@RestController  
public class HelloWorldController   
{  
//using get method and hello-world as URI  
@GetMapping(path="/hello-world")  
public String display()  
{  
return "Hello Worldddddddddd";  
}  
@GetMapping(path="/pathvariable/{name}")
public HelloWorldBean helloWorldPathVariable(@PathVariable String name,String id)
{
	return new HelloWorldBean(String.format("Hello World, %s", name,id)); //%s replace the name  
}
}