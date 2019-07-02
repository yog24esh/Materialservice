package com.accenture.lkm.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.lkm.business.bean.MaterialCategoryBean;

@RestController
public class MaterialController {

	private static final Logger logger = LoggerFactory.getLogger(MaterialController.class);
	
	
	/*
	 * Autowire the MaterialService object
	 * 
	 * */
	
	// Your Code Here
	
	@GetMapping("/")
	public String index() {
		return "Welcome to Spring Boot Material Service API!";
	}
	
	
	/* 
	 * Method - getMaterialCategories()
	 * Fetch all the material categories details using MaterialService and store it inside a List
	 * Return a ResponseEntity object passing the list of material categories
	 * 
	 */
		
	@GetMapping(value = "/material/controller/getMaterialCategories", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<MaterialCategoryBean>> getMaterialCategories() {
				
		// Your Code Here
		
		return null;
	}

	
	/* 
	 * Method - getMaterialCategoryById()
	 * Fetch a single MaterialCategoryBean using MaterialService object and passing --> categoryId
	 * Return a ResponseEntity object passing the MaterialCategoryBean object
	 * 
	 */
			
	@GetMapping(value = "/material/controller/getMaterialCategoryById/{categoryId}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MaterialCategoryBean> getMaterialCategoryById(@PathVariable String categoryId) {

		// Your Code Here
		
		return null;
	}
	
	
}
