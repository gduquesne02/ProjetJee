package com.univlittoral.projetback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.univlittoral.projetback.dto.LivreDTO;
import com.univlittoral.projetback.entity.LivreEntity;
import com.univlittoral.projetback.enums.enumGenre;
import com.univlittoral.projetback.mapper.LivreMapper;
import com.univlittoral.projetback.service.LivreService;

@RestController //-> est utilisé pour marquer les classes en tant que contrôleur Spring.
@RequestMapping(value = "/rest/bd/livres") //=> l’URL d’accès à votre controller.
public class LivreController {

    @Autowired
    private LivreService service;
    
	// Afficher la liste des livres
    @GetMapping
    public List<LivreDTO> findLivres() {
    	
    	return LivreMapper.map(service.findLivres());

	}
    
	// Afficher un livre en particulier    
	@GetMapping(value="{id}")
	public LivreDTO findLivre(@PathVariable Long id) {
		return LivreMapper.map(service.findLivrebyId(id));
	}
	
	//    
	@PostMapping
    public void addLivre(@RequestBody LivreEntity entity) {

    	service.addLivre(entity);
    }

	
    // Modifier un livre
    @PutMapping(value="{id}")
    public void updateLivre(@RequestBody LivreEntity entity) {

    	service.updateLivre(entity);
    }
    
    @DeleteMapping(value="{id}")
    public void deleteLivre(@PathVariable Long id) {
		service.deleteLivreById(id);
    
		}
    
    

     
	// Afficher la liste des pokemons selon le type

    @GetMapping(headers = "genre={genre}")
    public List<LivreDTO> findByType(@RequestParam enumGenre type) {
    	
    	return LivreMapper.map(service.findLivreByGenre(type));

	}
    
}
