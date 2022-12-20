package com.univlittoral.projetback.service;

import java.util.ArrayList;
import java.util.List;

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
		return livreRepo.findAll();
	}
	

	
	public LivreEntity findLivrebyId(Long id) {
		return livreRepo.findById(id).orElse(null);
	}
	
	public Integer nbLivres() {
		List<LivreEntity> nbLivres = findLivres();
		return nbLivres.size();
	}
	
	public Integer nbGenres() {
		ArrayList<String> liste = new ArrayList<String>();
		List<LivreEntity> nbLivres = findLivres();
		
		liste.add("BD");
		liste.add("MANGA");
		liste.add("POESIE");
		liste.add("NOUVELLE");
		liste.add("ROMAN");
		int compteur = 0;
        for(final LivreEntity genre : nbLivres) {
			if(nbLivres.contains(genre)) {
				compteur = compteur +1;
				System.out.println(genre.getGenre());
			}
			
        }
        System.out.println(compteur);
		return compteur;

	}

	public void deleteLivreById(Long id) {
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
