package com.univlittoral.projetback.mapper;

import java.util.ArrayList;
import java.util.List;

import com.univlittoral.projetback.dto.AuteurDTO;
import com.univlittoral.projetback.dto.LivreDTO;
import com.univlittoral.projetback.entity.LivreEntity;

public class LivreMapper {

	public static LivreDTO map(LivreEntity entity) {
		LivreDTO livre = new LivreDTO();

		
        livre.setNbPages(entity.getNbPages());
        livre.setDateParution(entity.getDateParution());
        livre.setEditeur(entity.getEditeur());
        livre.setGenre(entity.getGenre());
        livre.setId(entity.getId());
        livre.setLieuParution(entity.getLieuParution());
        livre.setNom(entity.getNom());
        
        
        
        return livre;
    }
    
    public static List<LivreDTO> map(List<LivreEntity> entities){
        if(null == entities) {
            return null;
        }
        List<LivreDTO> result = new ArrayList<LivreDTO>();
        for(final LivreEntity livre : entities) {
            result.add(LivreMapper.map(livre));
        }
        
        return result;
    }

}

