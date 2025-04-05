package com.framework.db.jpa_practice.models;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiError {

	private String message;
	private LocalDateTime localDateTime;
}
