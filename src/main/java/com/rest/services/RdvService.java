package com.rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entities.Rdv;
import com.rest.repositories.RdvRepository;
@Service
public class RdvService implements RdvInterface {
@Autowired
RdvRepository rdvRepository;

	
	
	@Override
	public Rdv createOneRdv(Rdv rdv) {
		// TODO Auto-generated method stub
		return rdvRepository.save(rdv);
	}

	@Override
	public List<Rdv> listerRdv() {
		// TODO Auto-generated method stub
		return rdvRepository.findAll();
	}

	@Override
	public void deleteRdv(int id) {
		// TODO Auto-generated method stub
		rdvRepository.deleteById(id);
		
	}

	@Override
	public List<Rdv> searchTitre(String titre) {
		// TODO Auto-generated method stub
		return rdvRepository.findBytitre(titre);
	}

	@Override
	public List<Rdv> searchDescriptionContent(String content) {
		// TODO Auto-generated method stub
		return rdvRepository.findByDescriptionContaining(content);
	}

	@Override
	public Optional<Rdv> searchRdvByid(int id) {
		// TODO Auto-generated method stub
		return rdvRepository.findById(id);
	}

}
