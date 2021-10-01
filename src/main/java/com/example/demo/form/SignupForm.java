package com.example.demo.form;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SignupForm {
	private String userId;
	private String password;
	private String comicName;
	private String authorName;
	
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date publishDay;
	
	private String detail;
}
