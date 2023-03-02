package com.example.demo.Controllers;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Book;
import com.example.demo.Repo.BookRepo;
import com.example.demo.Services.ApiService;
@RestController
public class ApiCont {
	@Autowired
	BookRepo serviceRepsitory;
	@Autowired
	ApiService service;
	
	@GetMapping("/getvalues")
	List<Book>getList()
	{
		return serviceRepsitory.findAll();
	}
	@PostMapping("/post")
	public Book create(@RequestBody Book sub) {
		return serviceRepsitory.save(sub);
	}
	
	@GetMapping("/getvalues/{id}")
	public Optional<Book> getbyid(@PathVariable int id)
	{
	return service.getBook(id);
	}
	@PutMapping("/student")
	public String update(@RequestBody Book sub)
	{
		return service.updateDetails(sub);
	}
	@DeleteMapping("/student")
	public String delete(@RequestParam int id)
	{
		return service.deleteDetails(id);
	}
}
