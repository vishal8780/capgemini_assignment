package capg.spring.vishal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(value="/hello")
	public String hello() {
		return "<h1>Hello World: Welcome to My First Spring Security Assignment</h1>";
	}
}
