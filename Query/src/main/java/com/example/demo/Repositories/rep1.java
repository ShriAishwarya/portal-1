package com.example.demo.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Models.model1;

public interface rep1 extends JpaRepository <model1,Long>
{
	public List<model1>findByDeptOrName(String d,String n);
	public List<model1>findByDeptAndName(String d,String n);
	
	public List<model1>findBySalary(List<Double>sal);
	public List<model1>findByNameStartingWith(String a);
	public List<model1>findByNameEndingWith(String b);

	@Query("select u from model u")
	public List<model1> getallusers();

	@Query("select u from model u where u.name=:a")
	public List<model1> getallusersname(@Param("a") String name);

	@Query("select u from model u where u.name=:a or u.dept=:d")
	public List<model1> getallusersname(@Param("a") String name,@Param ("d")String dep);

	@Modifying
	@Query("UPDATE model c set c.salary=:s where c.id=:id")
	public int getallusersalary(@Param ("s")double sal,@Param ("d")Long id);

}
