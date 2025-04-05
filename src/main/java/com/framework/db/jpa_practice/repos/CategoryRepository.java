package com.framework.db.jpa_practice.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.framework.db.jpa_practice.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
