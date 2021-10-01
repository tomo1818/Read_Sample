package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.user.model.Comic;

@Mapper
public interface ComicMapper {

//	ユーザー取得
	public List<Comic> findMany();
}
