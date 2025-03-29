package com.framework.db.jpa_practice.inheritance.joinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="jt_mentor")
@PrimaryKeyJoinColumn(name = "user_id")
public class Mentor extends User{
	private double avgRating;
	private String company;
}
