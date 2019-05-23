package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserMapper;

@Service
public class UserServiceImpl {
	@Autowired
	private UserMapper userMapper;
}
