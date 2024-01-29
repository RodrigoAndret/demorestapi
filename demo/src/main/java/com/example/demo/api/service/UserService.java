package com.example.demo.api.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.example.demo.api.model.User;

public class UserService {

	private List<User> userList;
	
	public UserService() {
		userList = new ArrayList<>();
		
		User user1 = new User(1,"rodrigo",32,"rodrigo@gmail.com");
		User user2 = new User(2,"rafael",24,"rafael@gmail.com");
		User user3 = new User(3,"gabriel",12,"gabriel@gmail.com");
		User user4 = new User(4,"vitor",55,"vitor@gmail.com");
		User user5 = new User(5,"joao",28,"joao@gmail.com");
		
		userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));
		
	}
	
	public Optional<User> getUser(Integer id) {
		Optional optional = Optional.empty();
		for(User user:userList) {
			if (id==user.getId() ) {
				optional = Optional.of(user);
				return optional;
			}
		}
		return optional;
	}

}
