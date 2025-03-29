package com.framework.db.jpa_practice.inheritance.mappedSuperClass;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
// MappedSuperClass are those classes who are not real entity in database..
// Data is persisted in child entity
public abstract class User {
	
	@Id
	private Long id;// making this id as PK(primary key) which applies to all child entities
	private String email;
	private String password;

}
