package com.univlittoral.projetback.dto;

import java.util.Date;
import java.util.List;

import com.univlittoral.projetback.entity.LivreEntity;

public class AuteurDTO {

	private Integer id;
	
	private String nom;
	
	private String prenom;
	
	private Date dateNaissance;
	


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}


	


	
}
