package com.vladimir.service;

import java.util.List;

import com.vladimir.model.User;
import com.vladimir.repository.UserRepository;
import com.vladimir.repository.UserRepositoryImpl;

public class UserServiceImpl implements UserService {
	UserRepository userRepository;
	
	
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}



	/* (non-Javadoc)
	 * @see com.vladimir.service.UserService#findAll()
	 */
	@Override
	public List<User> findAll(){
		return userRepository.findAll();
	}
}
