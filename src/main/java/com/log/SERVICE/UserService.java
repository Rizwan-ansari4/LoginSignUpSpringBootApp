package com.log.SERVICE;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.log.ENTITY.User;
import com.log.REPOSITORY.UserRepository;
import com.log.REQUEST.LoginRequest;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;
	
	public User addUser(User user) {
		return userRepo.save(user);
	}
	
	public boolean loginUser(LoginRequest loginReq) {
		
		Optional<User> user = userRepo.findById(loginReq.getUserId());
		
			if (user == null) {
				return false;
			}
			
			User users = user.get();
			if (!users.getPassword().equals(loginReq.getPassword())) {
				return false;
			}
			
			return true;
	}
	
}
