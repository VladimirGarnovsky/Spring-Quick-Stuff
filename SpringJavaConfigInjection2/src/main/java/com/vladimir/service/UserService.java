package com.vladimir.service;

import java.util.List;

import com.vladimir.model.User;
import com.vladimir.repository.UserRepository;

public interface UserService {
	public void setUserRepository(UserRepository userRepository);
	List<User> findAll();

}