	package com.univlittoral.projetback.dto;

import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.univlittoral.projetback.entity.AuteurEntity;
import com.univlittoral.projetback.enums.enumGenre;

public class LivreDTO {

	private Integer id;
	
	private String nom;
	
	private String editeur;
	
	private Integer nbPages;
	
	private Date dateParution;
	
	private String lieuParution;
	
	private AuteurEntity auteur;
	
	@Enumerated(EnumType.STRING)
	private enumGenre genre;

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

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public Integer getNbPages() {
		return nbPages;
	}

	public void setNbPages(Integer nbPages) {
		this.nbPages = nbPages;
	}

	public Date getDateParution() {
		return dateParution;
	}

	public void setDateParution(Date dateParution) {
		this.dateParution = dateParution;
	}

	public String getLieuParution() {
		return lieuParution;
	}

	public void setLieuParution(String lieuParution) {
		this.lieuParution = lieuParution;
	}


	public enumGenre getGenre() {
		return genre;
	}

	public void setGenre(enumGenre genre) {
		this.genre = genre;
	}

	public AuteurEntity getAuteur() {
		return auteur;
	}

	public void setAuteur(AuteurEntity auteur) {
		this.auteur = auteur;
	}



	
	


}
