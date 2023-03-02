package com.example.demo.Services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Models.Employee;
import com.example.demo.Repositories.EmployeeRepo;

@Service
public class ApiService {

	EmployeeRepo repository;
	public Optional<Employee> getEmployee(int id)
	{
		return repository.findById(id);
	}
	public String updateDetails(Employee emp)
	{
		repository.save(emp);
		return "updated";
	}
}
