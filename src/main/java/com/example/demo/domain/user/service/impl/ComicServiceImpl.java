package com.example.demo.domain.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.user.model.Comic;
import com.example.demo.domain.user.service.ComicService;
import com.example.demo.repository.ComicMapper;

@Service
public class ComicServiceImpl implements ComicService {

	@Autowired
	private ComicMapper mapper;
	
	@Override
	public List<Comic> getComics() {
		return mapper.findMany();
	}
}
