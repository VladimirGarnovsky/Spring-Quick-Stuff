package com.vladimir.repository;

import java.util.List;

import com.vladimir.model.User;

public interface UserRepository {

	List<User> findAll();

}