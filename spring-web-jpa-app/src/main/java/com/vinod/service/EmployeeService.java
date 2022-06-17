package com.vinod.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinod.dao.EmployeeRepository;
import com.vinod.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee getEmployee(Long id) {
		return employeeRepository.getEmployee(id);
	}
	
	public List<Employee> getEmployees() {
		return employeeRepository.getEmployees();
	}

	public String saveEmployee(String name) {
		Employee employee = new Employee();
		employee.setName(name);
		Long result = employeeRepository.saveEmployee(employee);
		
		return (" Row number " +result+ " has been added");
	}
}
