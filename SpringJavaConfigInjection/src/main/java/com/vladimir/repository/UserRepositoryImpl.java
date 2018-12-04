package com.vladimir.repository;

import java.util.ArrayList;
import java.util.List;

import com.vladimir.model.User;

public class UserRepositoryImpl implements UserRepository {
	List<User> users = new ArrayList<User>();
	
	
	@Override
	public List<User> findAll(){
		User user = new User();
		user.setName("Vladimir");
		user.setAge(25);
		user.setSalary(10000);
		users.add(user);
		return users;
	}
}
