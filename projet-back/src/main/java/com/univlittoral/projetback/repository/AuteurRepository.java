package com.univlittoral.projetback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.univlittoral.projetback.entity.AuteurEntity;



@Repository
public interface AuteurRepository extends JpaRepository<AuteurEntity, Long>{
	
	
	@Query(value="SELECT a.nom FROM AuteurEntity a where a.nom = :nom AND a.prenom = :prenom")
    String findAuteurByNom(@Param("nom") final String nom, @Param("prenom") final String prenom);

	@Query(value="SELECT a.prenom FROM AuteurEntity a where a.nom = :nom AND a.prenom = :prenom")
    String findAuteurByPrenom(@Param("nom") final String nom, @Param("prenom") final String prenom);
}