package com.univlittoral.projetback.mapper;

import java.util.ArrayList;
import java.util.List;

import com.univlittoral.projetback.dto.AuteurDTO;
import com.univlittoral.projetback.entity.AuteurEntity;

public class AuteurMapper {

	public static AuteurDTO map(AuteurEntity entity) {
		AuteurDTO auteur = new AuteurDTO();
        
		auteur.setIdAuteur(entity.getId());
        auteur.setDateNaissance(entity.getDateNaissance());
        auteur.setNom(entity.getNom());
        auteur.setPrenom(entity.getPrenom());

        
        
        
        return auteur;
    }
    
    public static List<AuteurDTO> map(List<AuteurEntity> entities){
        if(null == entities) {
            return null;
        }
        List<AuteurDTO> result = new ArrayList<AuteurDTO>();
        for(final AuteurEntity auteur : entities) {
            result.add(AuteurMapper.map(auteur));
        }
        
        return result;
    }
}
