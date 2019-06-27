package com.accenture.lkm.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaterialController {

	@Value("${welcome}")
	private String message;
	
	@GetMapping("/")
	public String index() {
		return message;
	}
	
}
