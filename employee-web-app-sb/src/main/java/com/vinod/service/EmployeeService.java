package com.vinod.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinod.dao.EmployeeRepository;
import com.vinod.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee getEmployee(Long id) {
		return employeeRepository.findById(id).orElse(null);
	}
	
	public Employee getEmployeeByName(String name) {
		return employeeRepository.findByName(name);
	}
	
	public Employee saveEmployee(String name) {		
		Employee emp = new Employee();
		emp.setName(name);
		
		return employeeRepository.save(emp);
	}

	public List<Employee> getByNameId(String name, Long id) {
		
		return employeeRepository.findByNameOrId(name, id);
	}
}
