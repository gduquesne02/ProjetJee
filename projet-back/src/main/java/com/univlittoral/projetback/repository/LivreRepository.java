package com.univlittoral.projetback.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.univlittoral.projetback.entity.LivreEntity;
import com.univlittoral.projetback.enums.enumGenre;



@Repository
public interface LivreRepository extends JpaRepository<LivreEntity, Long>{
	
	
    @Query(value="SELECT l FROM LivreEntity l where l.genre = :genre")
    List<LivreEntity> findLivresByGenre(@Param("genre") final enumGenre genre);
}