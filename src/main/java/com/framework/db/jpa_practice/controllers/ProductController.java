package com.framework.db.jpa_practice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.framework.db.jpa_practice.exceptions.ProductNotFoundException;
import com.framework.db.jpa_practice.models.Product;
import com.framework.db.jpa_practice.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	private final ProductService productService;
	
	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@PostMapping
	public ResponseEntity<Product> save(@RequestBody Product product){
		Product savedProduct = productService.save(product);
		return new ResponseEntity<Product>(savedProduct, HttpStatus.CREATED);		
	}

	@GetMapping
	public ResponseEntity<Product> findByTitle(@RequestParam("title") String title) throws ProductNotFoundException{
		Product product = productService.findByTitle(title);
		return new ResponseEntity<Product>(product, HttpStatus.OK);		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> findById(@PathVariable("id") Long id) throws ProductNotFoundException{
		Product product = productService.findById(id);
		return new ResponseEntity<Product>(product, HttpStatus.OK);		
	}

}
