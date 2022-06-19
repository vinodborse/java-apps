package com.vinod.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vinod.model.Employee;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	
	public Employee findByName(String name);
	public List<Employee> findByNameOrId(String name, Long id);
}
