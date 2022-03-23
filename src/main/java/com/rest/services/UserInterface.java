package com.rest.services;

import java.util.List;
import java.util.Optional;

import com.rest.entities.User;

public interface UserInterface {
 User createOneUser(User user);
 List<User> findAllUsers();
 List<User> findUsersBynomPrenom(String nom,String prenom);
 List<User> searchEmail(String email);
 void deleteUser(long id);
 Optional<User> findByidUser(long id);
 List<User> readOrderd();
 
 
	
	
}
