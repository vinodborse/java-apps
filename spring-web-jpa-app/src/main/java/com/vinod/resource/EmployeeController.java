package com.vinod.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vinod.model.Employee;
import com.vinod.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(value = "/emp/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee(@PathVariable("id") Long id) {
		
		return employeeService.getEmployee(id);
	}
	
	@GetMapping(value = "/emps", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getEmployees() {	
		return employeeService.getEmployees();
	}
	
	@PostMapping("/emp")
	public String saveEmployee(@RequestParam("name") String name) {
		return employeeService.saveEmployee(name);
	}
}
