package com.example.demo.domain.user.model;

import java.util.Date;

import lombok.Data;

@Data
public class Comic {
	private String userId;
	private String password;
	private String comicName;
	private Date publishDay;
	private String authorName;
	private String detail;
}
