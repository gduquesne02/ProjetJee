package com.univlittoral.projetback.mapper;

import java.util.ArrayList;
import java.util.List;

import com.univlittoral.projetback.dto.LivreDTO;
import com.univlittoral.projetback.entity.LivreEntity;

public class LivreMapper {


	public static LivreDTO map(LivreEntity entity) {
		LivreDTO livre = new LivreDTO();
		  
		  
		livre.setId(entity.getId()); 
		livre.setNom(entity.getNom());
		livre.setEditeur(entity.getEditeur());
		livre.setNbPages(entity.getNbPages());
		livre.setDateParution(entity.getDateParution()); 
		livre.setLieuParution(entity.getLieuParution()); 
		
		livre.setAuteur(entity.getAuteur());
		livre.setGenre(entity.getGenre()); 

		  return livre;
		 
	}
	
	//Permet de récupérer les Pokémon
	public static List<LivreDTO> map(List<LivreEntity> LivreEntity){
		if(null == LivreEntity) {
			return null;
		}
		List<LivreDTO> result = new ArrayList<LivreDTO>();
		for(final LivreEntity livre : LivreEntity) {
			result.add(LivreMapper.map(livre));
		}
		
		return result;
	}
	

}

