package com.vishal.resource;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vishal.model.Employee;
import com.vishal.repositiory.EmployeeRepository;


@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository repository;
	@PostMapping("/addbook")
	public int saveBook(@RequestBody Employee employee ) {
	repository.save(employee);
	return employee.getId();
}
	@GetMapping("/findSingleEmployee/{id}")
	public Optional<Employee> getEmployee(@PathVariable int id)
	{
        return repository.findById(id);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id) {
		repository.deleteById(id);
		return "book deleted with id: " +id;
	}
	@GetMapping("/findAll")
	public List<Employee> getBooks()
	{
		return repository.findAll();
	}
	
}
