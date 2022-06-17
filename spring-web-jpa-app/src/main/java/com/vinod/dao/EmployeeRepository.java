package com.vinod.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.vinod.model.Employee;

@Repository
public class EmployeeRepository {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public Employee getEmployee(Long id) {
		Employee emp = hibernateTemplate.get(Employee.class, id);
		
		return emp;
	}
	
	public List<Employee> getEmployees() {
		return hibernateTemplate.loadAll(Employee.class);
	}

	@Transactional
	public Long saveEmployee(Employee employee) {
		Long i = (Long) hibernateTemplate.save(employee);
		return i;
	}
}
