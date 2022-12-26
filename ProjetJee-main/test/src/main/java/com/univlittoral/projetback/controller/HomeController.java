package com.univlittoral.projetback.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import com.univlittoral.projetback.dto.AuteurDTO;
import com.univlittoral.projetback.dto.GraphiqueDTO;
import com.univlittoral.projetback.dto.HomeDTO;
import com.univlittoral.projetback.dto.IndicateursDTO;
import com.univlittoral.projetback.dto.LivreDTO;
import com.univlittoral.projetback.entity.LivreEntity;
import com.univlittoral.projetback.enums.enumGenre;
import com.univlittoral.projetback.mapper.AuteurMapper;
import com.univlittoral.projetback.mapper.LivreMapper;
import com.univlittoral.projetback.service.AuteurService;
import com.univlittoral.projetback.service.LivreService;

import io.swagger.v3.oas.annotations.Operation;

@RestController //-> est utilisé pour marquer les classes en tant que contrôleur Spring.
@RequestMapping(value = "/rest/bd/") //=> l’URL d’accès à votre controller.
public class HomeController {
	
   @Autowired
   private LivreService livreService;
   @Autowired
   private AuteurService auteurService;

	
   	@GetMapping(value ="/home")
   	@Operation(summary ="Affiche la page d’accueil de l’application, avec les indicateurs et les livres triés en ASC")
    public HomeDTO home() {
    	HomeDTO home = new HomeDTO();
    	IndicateursDTO indic = new IndicateursDTO();
    	GraphiqueDTO graph = new GraphiqueDTO();
    	
    	
    	List<String> listeColor = new ArrayList<String>(); 
    	List<String> listeLabels = new ArrayList<String>(); 
    	List<Integer> listeValues = new ArrayList<Integer>(); 

    	Map<String, Integer> genres = new HashMap<String, Integer>();

    	
    	indic.setNbLivres(livreService.nbLivres());
    	indic.setNbAuteurs(auteurService.nbAuteurs());
    	indic.setNbGenres(livreService.nbGenres());
    	home.setIndicateurs(indic);
    	home.setLivres(LivreMapper.map(livreService.findLivres()));
    	home.setGenres(livreService.nbParGenre());
 
    	
    	genres = livreService.nbParGenre();
    	
        for (Map.Entry<String, Integer> entry : genres.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            
            listeValues.add(value);
            listeLabels.add(key);
            
        }
    	listeColor.add("#232D4B");
    	listeColor.add("#CCC");
    	listeColor.add("#00AB9B");
    	listeColor.add("#333");
    	listeColor.add("#888");

    	graph.setColors(listeColor);
    	graph.setLabels(listeLabels);
    	graph.setValues(listeValues);
    	
    	home.setDatasGraph(graph);

    	
    	
		return home;
    }
    
    //Retrouver un livre avec son id
    @GetMapping("/livres/{id}")
    @Operation(summary ="Récupère le livre ayant comme clé primaire {id}")
    public LivreDTO findById(@PathVariable Integer id) {
        return LivreMapper.map(livreService.findLivrebyId(id));
    }
    
    //Supprimer un livre
    @DeleteMapping("/livres/{id}")
    @Operation(summary ="Supprime le livre ayant comme clé primaire {id}")
    public void deleteById(@PathVariable int id) {
        livreService.deleteLivreById(id);
    }
    
    //Ajout d'un livre
    @PostMapping("/livres")
    @Operation(summary ="Insère le livre rempli via le formulaire en base.")
    public void save(@RequestBody LivreEntity reqAddLivre) {
        livreService.addLivre(reqAddLivre);
    }
    
    //Modification d'un livre
    @PutMapping("/livres/{id}")
    @Operation(summary ="Modifie le livre ayant comme clé primaire {id}")
    public void updateLivre(@RequestBody LivreEntity entity) {

    	livreService.updateLivre(entity);
    }
    
    //Trouver les livres du genre
    @GetMapping("livres")
    @Operation(summary ="Récupère une liste de livres ayant comme genre {param}")
	public List<LivreDTO> findByGenre(@RequestParam enumGenre genre){
		return LivreMapper.map(livreService.findLivreByGenre(genre));
	}
    
    
    
  //Retrouver un auteur avec son id
    @GetMapping("/auteurs/{id}")
    @Operation(summary ="Récupère l’auteur ayant comme clé primaire {id}")
    public AuteurDTO findAuteurById(@PathVariable Integer id) {
        return AuteurMapper.map(auteurService.findAuteurById(id));
    }
    
	//Obtenir les auteurs
	@GetMapping("/auteurs")
	@Operation(summary ="Affiche une liste d’auteurs")
	public List<AuteurDTO> findAllAuteurs(){
		return AuteurMapper.map(auteurService.findAuteurs());
	}
    
}
