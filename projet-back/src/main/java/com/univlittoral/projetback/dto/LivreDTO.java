package com.univlittoral.projetback.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.univlittoral.projetback.entity.AuteurEntity;
import com.univlittoral.projetback.enums.enumGenre;

public class LivreDTO {

	private Long id;
	private String lieuParution;
	private String dateParution;
	private String editeur;
	@Enumerated(EnumType.STRING)
	private enumGenre genre;
	private Integer nbPages;
	private String nom;
	private AuteurEntity auteur;
	
	


	public AuteurEntity getAuteur() {
		return auteur;
	}
	public void setAuteur(AuteurEntity auteur) {
		this.auteur = auteur;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getLieuParution() {
		return lieuParution;
	}
	public void setLieuParution(String lieuParution) {
		this.lieuParution = lieuParution;
	}
	public String getDateParution() {
		return dateParution;
	}
	public void setDateParution(String dateParution) {
		this.dateParution = dateParution;
	}
	public String getEditeur() {
		return editeur;
	}
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}
	public enumGenre getGenre() {
		return genre;
	}
	public void setGenre(enumGenre genre) {
		this.genre = genre;
	}

	public Integer getNbPages() {
		return nbPages;
	}
	public void setNbPages(Integer nbPages) {
		this.nbPages = nbPages;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nomLivre) {
		this.nom = nomLivre;
	}
}
