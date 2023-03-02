package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.model1;
import com.example.demo.Services.serv1;

import jakarta.transaction.Transactional;

@RestController
public class Cont1 {
	@Autowired
	serv1 service;
	@GetMapping("/findname/{name}/{dept}")
	public List<model1>findbydetails(@PathVariable String name,@PathVariable String dept){
		return service.findByDeptAndName(dept,name);
		
	}
	@GetMapping("/findname/{name}/{dept}")
		public List<model1>finddetails(@PathVariable String name,@PathVariable String dept)
		{
			return service.findByDeptAndName(dept,name);
		}
		@GetMapping("/getsalary")
		public List<model1>findbysal(@RequestParam("Salary")List<Double> sal){
			List<model1>s1=service.findBySalaryIn(sal);
		return s1;	
		}
		@GetMapping("/getnames/{start}")
		public List<model1>findByname(@PathVariable("start")String start){
			return service.findByNameStartingWith(start);
			
		}
		@GetMapping("/getnames/{end}")
		public List<model1>findByname1(@PathVariable("start")String end){
			return service.findByNameEndingWith(end);
			
		}
		@GetMapping("/getAllusers")
		public List<model1>getalluserList()
		{
			return service.getallusers();		
		}
		@GetMapping("/getallusers/{name}")
		public List<model1>getallusersListname(@PathVariable String name)
		{
			return service.getallusersname(name);
		}
		@Transactional
	     @PutMapping(value="/getallusers/{sal}/{id}")
	     public String getalluserListname(@PathVariable("sal") double sal,@PathVariable long id) {
	    	 String res="";
	    	 int result=service.getalluseral(sal, id);
	    	 if(result>0) {
	    		 res="Salary updated"+result;
	    		 System.err.println(res);
	    	 }
	    	 else {
	    		 res="Not updated"+result;
	    		 System.err.println(res);
	    	 }
	    	   return res;
		}
}
