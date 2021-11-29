package com.vishal.resource;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vishal.model.Admin;
import com.vishal.repository.AdminRepository;


@RestController
public class AdminController {
	@Autowired
	private AdminRepository repository;
	@PostMapping("/addProduct")
	public int saveBook(@RequestBody Admin admin ) {
	repository.save(admin);
	return admin.getId();
}
	@GetMapping("/findSipecificProduct/{id}")
	public Optional<Admin> getProduct(@PathVariable int id)
	{
        return repository.findById(id);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		repository.deleteById(id);
		return "Product deleted with id: " +id;
	}
	@GetMapping("/findAll")
	public List<Admin> getBooks()
	{
		return repository.findAll();
	}

	@PutMapping("/updateProduct")
 public void updateProduct(@RequestBody Admin admin) {
	if (admin != null)
	    repository.save(admin);
}

}
