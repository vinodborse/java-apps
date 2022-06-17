package com.vinod.resource;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vinod.model.Employee;

@Controller
public class DemoController {

	
	@GetMapping(value = "/data", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Employee data() {
		System.out.println("Hello ");
		
		Employee emp = new Employee();
		emp.setName("Vinod");
		return emp;
	}
}
