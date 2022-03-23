package com.rest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.entities.Rdv;

public interface RdvRepository extends JpaRepository<Rdv, Integer> {
List<Rdv> findBytitre(String titre);
List<Rdv> findByDescriptionContaining(String contenu);
}
