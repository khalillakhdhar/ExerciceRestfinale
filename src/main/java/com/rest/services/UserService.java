package com.rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entities.User;
import com.rest.repositories.UserRepository;

@Service
public class UserService implements UserInterface {
@Autowired
UserRepository userRepository;
	
	
	@Override
	public User createOneUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public List<User> findUsersBynomPrenom(String nom, String prenom) {
		// TODO Auto-generated method stub
		return userRepository.findByNomOrPrenom(nom, prenom);
	}

	@Override
	public List<User> searchEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.findByEmail(email);
	}

	@Override
	public void deleteUser(long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
		
	}

	@Override
	public Optional<User> findByidUser(long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	@Override
	public List<User> readOrderd() {
		// TODO Auto-generated method stub
		return userRepository.findorderedByage();
	}

}
