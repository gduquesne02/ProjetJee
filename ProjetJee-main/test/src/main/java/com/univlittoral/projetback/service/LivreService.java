package com.univlittoral.projetback.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.univlittoral.projetback.entity.LivreEntity;
import com.univlittoral.projetback.enums.enumGenre;
import com.univlittoral.projetback.repository.LivreRepository;

@Service
public class LivreService {

	
	@Autowired
	private LivreRepository livreRepo; 

	
	public List<LivreEntity> findLivres(){
		return livreRepo.findAllLivresRepo();
	}
	

	
	public LivreEntity findLivrebyId(Integer id) {
		return livreRepo.findById(id).orElse(null);
	}
	
	public Integer nbLivres() {
		List<LivreEntity> nbLivres = findLivres();
		return nbLivres.size();
	}
	
	public Integer nbGenres() {
		
		List listeGenre = new ArrayList();
        for(final LivreEntity entity : livreRepo.findAll()) {
            if(!listeGenre.contains(entity.getGenre())) {
            	listeGenre.add(entity.getGenre());
            }
        }
		return listeGenre.size();

	}
	
	public Map<String, Integer> nbParGenre() {
		
		Map<String, Integer> genres = new HashMap<String, Integer>();
		
		List<String> listeGenre = new ArrayList<String>();
		

		
        for(final LivreEntity entity : livreRepo.findAll()) {
            	listeGenre.add(entity.getGenre().toString());
        }
        // Calcul des fréquences de chaque genres
  		 int frequencebd = Collections.frequency(listeGenre, "BD");
		 int frequenceroman = Collections.frequency(listeGenre, "ROMAN");
		 int frequencepoesie = Collections.frequency(listeGenre, "POESIE");
		 int frequencenouvelle = Collections.frequency(listeGenre, "NOUVELLE");
		 int frequencemanga = Collections.frequency(listeGenre, "MANGA");
		 
		 
		// ajout dans le Hashmap
		genres.put("BD", frequencebd);
		genres.put("MANGA", frequencemanga);
		genres.put("POESIE", frequencepoesie);
		genres.put("ROMAN", frequenceroman);
		genres.put("NOUVELLE", frequencenouvelle);

		 
		 
		return genres;
	}

	public void deleteLivreById(Integer id) {
		livreRepo.deleteById(id);
	}
	
	public void addLivre (LivreEntity entity) {
		
	    livreRepo.save(entity);
	}



	public void updateLivre(LivreEntity entity) {
	    livreRepo.save(entity);

	}

	
	public List<LivreEntity> findLivreByGenre(enumGenre genre) {
		return livreRepo.findLivresByGenre(genre);
	}
}
