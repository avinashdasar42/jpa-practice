package com.framework.db.jpa_practice.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.framework.db.jpa_practice.exceptions.ProductNotFoundException;
import com.framework.db.jpa_practice.models.Category;
import com.framework.db.jpa_practice.models.Product;
import com.framework.db.jpa_practice.repos.CategoryRepository;
import com.framework.db.jpa_practice.repos.ProductRepository;

@Service
public class MyProductServiceImpl implements ProductService {
	
	private final ProductRepository productRepository;
	private final CategoryRepository categoryRepository;

	public MyProductServiceImpl(ProductRepository productRepository, CategoryRepository categoryRepository) {
		this.productRepository = productRepository;
		this.categoryRepository = categoryRepository;
	}

	@Override
	public Product save(Product product) {
		Category category = product.getCategory();
		if(category.getId() == null) {
			Category savedCategory = categoryRepository.save(category);
			product.setCategory(savedCategory);
		}
		return productRepository.save(product);
	}

	@Override
	public Product findById(Long id) throws ProductNotFoundException {
		Optional<Product> product = productRepository.findById(id);
		if(product.isEmpty()) {
			throw new ProductNotFoundException(id,"Product Not found");
		}
		return product.get();		
	}

	@Override
	public Product findByTitle(String title) throws ProductNotFoundException {
		Optional<Product> savedProduct = productRepository.findByTitle(title);
		if(savedProduct.isEmpty()) {
			throw new ProductNotFoundException("Product Not found");
		}
		return savedProduct.get();
	}

}
