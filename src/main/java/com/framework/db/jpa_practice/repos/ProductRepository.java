package com.framework.db.jpa_practice.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.framework.db.jpa_practice.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	Optional<Product> findByTitle(String title);
}
