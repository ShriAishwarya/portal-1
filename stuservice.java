package com.example.demo;

import java.util.List;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class stuservice {
	
		@Autowired	
		studentsrepastory repository;
		public Optional<detail1> getdetail1(int id)
		{
			return repository.findById(id);
		}
		public String updateDetails(detail1 stu)
		{
			repository.save(stu);
			return "updated";
		}
		public String deleteDetails(int id)
		{
			repository.deleteById(id);
			return "Id Deleted";
		}
		public List<detail1> setPages( @PathVariable int offset,@PathVariable int pageSize)
		{
			Page<detail1>page=repository.findAll(PageRequest.of(offset, pageSize));
			return page.getContent();
			
		}
		public List<detail1>getSort(String field)
		{
			return repository.findAll(Sort.by(Sort.Direction.DESC,field));
		}
		
	}


