package com.framework.db.jpa_practice.inheritance.mappedSuperClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="msc_instructor")
public class Instructor extends User{
	
	private double avgRating;
	private int totalBatches;

}
