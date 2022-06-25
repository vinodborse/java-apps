package com.review.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@GetMapping("/app")
	public String sample() {
		return "You are in FILMY DUNIYA.!!!!";
	}

}
