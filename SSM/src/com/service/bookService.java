package com.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mapper.BookMapper;

import com.pojo.Book;

@Service("bookService")
public class bookService {
	@Resource
	private BookMapper dao;
	
	public Book findById(long bookno) throws Exception{
		return (Book)dao.selectByPrimaryKey(bookno);
	}
}
