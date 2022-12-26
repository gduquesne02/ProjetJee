package com.univlittoral.projetback.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.univlittoral.projetback.entity.LivreEntity;
import com.univlittoral.projetback.enums.enumGenre;



@Repository
public interface LivreRepository extends JpaRepository<LivreEntity, Integer>{
	
	
    @Query(value="SELECT l FROM LivreEntity l where l.genre = :genre")
    List<LivreEntity> findLivresByGenre(@Param("genre") final enumGenre genre);
    
	//Récupère la liste de livres triée dans l'ordre alphabétique
	@Query(value="SELECT * FROM livres order by nom ASC", nativeQuery=true)
	public List<LivreEntity> findAllLivresRepo();

    @Query(value="SELECT l FROM LivreEntity l where l.auteur = :auteur")
    List<LivreEntity> findLivresByAuteur(@Param("auteur") final Integer auteur);
}