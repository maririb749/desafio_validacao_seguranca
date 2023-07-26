package com.devsuperior.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.devsuperior.demo.entities.User;
import com.devsuperior.demo.repositoryes.UserRepository;
@Service
public class UserService implements UserDetailsService{
	
	private static Logger Logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repository.findByEmail(username);
		if(user == null) {
			Logger.error("User not found" + username);
			throw new UsernameNotFoundException("E-mail not found");
		}
		Logger.info("User found" + username);
		return user;
	}
}
	


    



