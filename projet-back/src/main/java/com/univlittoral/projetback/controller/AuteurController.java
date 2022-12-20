package com.univlittoral.projetback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.univlittoral.projetback.dto.AuteurDTO;
import com.univlittoral.projetback.mapper.AuteurMapper;
import com.univlittoral.projetback.service.AuteurService;

@RestController //-> est utilisé pour marquer les classes en tant que contrôleur Spring.
@RequestMapping(value = "/rest/bd/auteurs") //=> l’URL d’accès à votre controller.
public class AuteurController {
	

   @Autowired
   private AuteurService auteurService;

   
	// Afficher la liste des auteurs
   @GetMapping
   public List<AuteurDTO> findAuteurs() {
   	
   	return AuteurMapper.map(auteurService.findAuteurs());

	}
   
	@GetMapping(value="{id}")
	public AuteurDTO findAuteur(@PathVariable Long id) {
		return AuteurMapper.map(auteurService.findAuteurById(id));
	}

    
}
