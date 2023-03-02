package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.model1;
import com.example.demo.Repositories.rep1;

@Service
public class serv1 {
	@Autowired
	rep1 repo;
	
	public List<model1>findByDeptAndName(String d,String n){
		return repo.findByDeptOrName(d,n);
	}
	public List<model1>findByDeptAndName1(String d,String n){
		return repo.findByDeptAndName(d,n);
	}
	public List<model1>findBySalaryIn(List<Double>sal){
		return repo.findBySalary(sal);
	}
	public List<model1>findByNameStartingWith(String a){
		return repo.findByNameStartingWith(a);
	}
	public List<model1>findByNameEndingWith(String b){
		return repo.findByNameEndingWith(b);
	}
	
	public List<model1> getallusers(){
		return repo.getallusers();
		}

	public List<model1> getallusersname(String n){
		return repo.getallusersname(n);
		}

	public List<model1> getallusersname(String n,String d){
		return repo.getallusersname(n,d);
		}
	public int getalluseral(double sal,long id) {
		return repo.getallusersalary(sal,id);
	}
}