package com.example.demo;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class studentController {
	@Autowired
	studentsrepastory serviceRepsitory;
	@Autowired
	stuservice service;
	
	@GetMapping("/getvalues")
	List<detail1>getList()
	{
		return serviceRepsitory.findAll();
	}
	@PostMapping("/post")
	public detail1 create(@RequestBody detail1 stu) {
		return serviceRepsitory.save(stu);
	}
	
	@GetMapping("/getvalues/{id}")
	public Optional<detail1> getbyid(@PathVariable int id)
	{
	return service.getdetail1(id);
	}
	@PutMapping("/student")
	public String update(@RequestBody detail1 stu)
	{
		return service.updateDetails(stu);
	}
	@DeleteMapping("/student")
	public String delete(@RequestParam int id)
	{
		return service.deleteDetails(id);
		 /* for deleteing in postman:
			localhost:8080/student?id=66
		 */
	}
	@GetMapping("/student/{osffset}/{pageSize}")
	public List<detail1>studentWithPagination(@PathVariable int offset,@PathVariable int pageSize)
	{
		return service.setPages(offset,pageSize);
	}
	@GetMapping("/student/{field}")
	public List<detail1>studentSortList(@PathVariable String field)
	{
		return service.getSort(field);
	}
	@GetMappping("/sortandpage/{offset}/{pageno}/{field}")
	{
		public Page<detail1> sortPagination (@PathVariable int offset)
	}

}
