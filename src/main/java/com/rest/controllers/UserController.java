package com.rest.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entities.User;
import com.rest.services.UserService;

@RestController
@RequestMapping("user") // general mapping
public class UserController {
@Autowired
UserService userService;
	
@GetMapping
List<User> showAllUsers()
{
return 	userService.findAllUsers();

}
@PostMapping
User createOneUser(@RequestBody @Valid User user)
{
return userService.createOneUser(user);	
}
@DeleteMapping("/{id}")
public void DeleteMyUser(@PathVariable long id)
{
	userService.deleteUser(id);
	
}
@GetMapping("/search/{nom}/{prenom}")
public List<User> findBynames(@PathVariable String nom,String prenom)
{
return userService.findUsersBynomPrenom(nom, prenom);	

}
@GetMapping("/search/{email}")
public List<User> findbyemails(@PathVariable String email)
{
return userService.searchEmail(email);	


}
	
	
	
}
