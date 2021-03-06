package cn.hyyf.ssm.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.hyyf.ssm.domain.User;
import cn.hyyf.ssm.mapper.UserMapper;
import cn.hyyf.ssm.service.UserService;


@Repository
public class UserServiceImpl implements UserService {  
	
	@Autowired
	private UserMapper userMapper;
	@Override
	public User getUserById(int userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

 
}  
