package com.vinod.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable {
	
	
	private static final long serialVersionUID = 6825686361815571064L;

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "emp_name")
	private String name;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Employee(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Employee() {}

	
}
