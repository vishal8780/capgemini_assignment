package com.vishal.main;



import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	@GetMapping(path="/assignment")
	public List<Book> getAllBooks()
	{
		return Arrays.asList(new Book(1l,"Master Spring 5.0","Naveen"));
	}

}
