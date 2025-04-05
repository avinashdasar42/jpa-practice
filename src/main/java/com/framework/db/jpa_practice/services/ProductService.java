package com.framework.db.jpa_practice.services;

import com.framework.db.jpa_practice.exceptions.ProductNotFoundException;
import com.framework.db.jpa_practice.models.Product;

public interface ProductService {

	Product save(Product product);
	Product findById(Long id) throws ProductNotFoundException;
	Product findByTitle(String title) throws ProductNotFoundException;
	
}
