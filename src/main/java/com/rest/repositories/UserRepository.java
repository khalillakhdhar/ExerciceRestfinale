package com.rest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rest.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
List<User> findByEmail(String email);
List<User> findByNomOrPrenom(String nom,String prenom);
@Query("Select u From User u Order by u.age")
List<User> findorderedByage();


}
