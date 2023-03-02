package com.example.demo.Controllers;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Employee;
import com.example.demo.Repositories.EmployeeRepo;
import com.example.demo.Services.ApiService;

@RestController
public class ApiController {
	@Autowired
	 EmployeeRepo serviceRepsitory;
	@Autowired 
	ApiService service;
	
	@GetMapping("/getemp")
	List<Employee>getList()
	{
		return serviceRepsitory.findAll();
	}
	@PostMapping("/postemp")
	public Employee create(@RequestBody Employee emp) {
		return serviceRepsitory.save(emp);
	}
	@GetMapping("/getemp/{id}")
	public Optional<Employee> getbyid(@PathVariable int id)
	{
		return service.getEmployee(id);
	}
}
