package com.univlittoral.projetback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.univlittoral.projetback.dto.AuteurDTO;
import com.univlittoral.projetback.dto.GraphiqueDTO;
import com.univlittoral.projetback.dto.HomeDTO;
import com.univlittoral.projetback.dto.IndicateursDTO;
import com.univlittoral.projetback.entity.LivreEntity;
import com.univlittoral.projetback.mapper.AuteurMapper;
import com.univlittoral.projetback.mapper.LivreMapper;
import com.univlittoral.projetback.service.AuteurService;
import com.univlittoral.projetback.service.LivreService;

@RestController //-> est utilisé pour marquer les classes en tant que contrôleur Spring.
@RequestMapping(value = "/rest/bd/home") //=> l’URL d’accès à votre controller.
public class HomeController {
	
   @Autowired
   private LivreService livreService;
   @Autowired
   private AuteurService auteurService;

	
    @GetMapping
    public HomeDTO home() {
    	HomeDTO home = new HomeDTO();
    	IndicateursDTO indic = new IndicateursDTO();
    	AuteurDTO auteur = new AuteurDTO();
    	GraphiqueDTO graph = new GraphiqueDTO();
    	

    	indic.setNbLivres(livreService.nbLivres());
    	indic.setNbAuteurs(auteurService.nbAuteurs());
    	indic.setNbGenres(livreService.nbGenres());
    	home.setIndicateurs(indic);
    	home.setLivres(LivreMapper.map(livreService.findLivres()));
    	
    	//auteur.setPrenom(auteurService.findAuteurByPrenom());
    	//auteur.setNom(auteurService.findAuteurByNom());
    	
    	
		return home;
    	
    }
    

    
}
