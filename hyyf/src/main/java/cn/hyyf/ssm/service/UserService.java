package cn.hyyf.ssm.service;

import org.springframework.stereotype.Service;

import cn.hyyf.ssm.domain.User;


@Service
public interface UserService {
	 public User getUserById(int userId);
}
