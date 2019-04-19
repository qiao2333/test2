package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mapper.UserMapper;
import com.pojo.User;
import com.pojo.UserExample;


@Service("userService")
public class userService {
	@Resource
	private UserMapper dao;
	
	public User findById(int id) throws Exception{
		return (User)dao.selectByPrimaryKey(id);
	}
	
}
