package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserMapper;
import com.example.demo.model.User;
import com.example.demo.result.Result;
import com.example.demo.result.ResultFactory;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/login")
public class UserApi {
	@Autowired
	private UserMapper userMapper;

	@RequestMapping(value = "/dologin",method=RequestMethod.POST)
	@ResponseBody
	public Result getUsers(@Validated @RequestBody User user, BindingResult bindingResult) {
		User users = userMapper.selectUsers(user);
		if (users == null) {
			String message = String.format("登陆失败，详细信息[%s]。", bindingResult.getFieldError().getDefaultMessage());
			return ResultFactory.buildFailResult(message);
		} else {
			return ResultFactory.buildSuccessResult(users);
		}
	}
}
