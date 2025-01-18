package com.main.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.module.User;
import com.main.userRepo.UserRepository;

@Service
public class UserService {


	@Autowired
	private UserRepository userRepository;

	public User saveUser(User user) {
 		return  this.userRepository.save(user);
	} 
	
	
	
	
	
	
}
