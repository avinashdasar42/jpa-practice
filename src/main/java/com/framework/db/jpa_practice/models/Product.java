package com.framework.db.jpa_practice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends BaseModel{
	
	private String title;
	private String description;
	@ManyToOne
	@JoinColumn(name = "category_id_column")
	private Category category;
	
}
