package com.framework.db.jpa_practice.inheritance.joinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)// to make inheritance strategy as JoinedTable
@Entity(name="jt_user")
//JoinedTable is used when we need to persist parent entity in table
//which can be referred using Foreign Key(FK)
public class User {
	
	@Id
	private Long id;// making this id as PK(primary key) which applies to all child entities
	private String email;
	private String password;

}
