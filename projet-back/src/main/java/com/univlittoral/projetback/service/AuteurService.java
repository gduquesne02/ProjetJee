package com.univlittoral.projetback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.univlittoral.projetback.entity.AuteurEntity;
import com.univlittoral.projetback.entity.LivreEntity;
import com.univlittoral.projetback.enums.enumGenre;
import com.univlittoral.projetback.repository.AuteurRepository;

@Service
public class AuteurService {

	@Autowired
	private AuteurRepository auteurRepo; 
	 
	 
	 
	public List<AuteurEntity> findAuteurs(){
		return auteurRepo.findAll();
	}
	
	
	public Integer nbAuteurs() {
		List<AuteurEntity> nbAuteurs = findAuteurs();
		return nbAuteurs.size();
	}
	
	public AuteurEntity findAuteurById(Long id) {
		return auteurRepo.findById(id).orElse(null);
	}
	
	public String findAuteurByNom(String nom, String prenom) {
		return auteurRepo.findAuteurByNom(nom, prenom);
	}
	
	public String findAuteurByPrenom(String nom, String prenom) {
		return auteurRepo.findAuteurByNom(nom, prenom);
	}
}
