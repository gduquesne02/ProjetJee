package com.univlittoral.projetback.dto;

public class AuteurDTO {

	private Long idAuteur;
	private Long idLivre;
	private String prenom;
	private String nom;
	private String dateNaissance;
	
	
	public Long getIdAuteur() {
		return idAuteur;
	}
	public void setIdAuteur(Long idAuteur) {
		this.idAuteur = idAuteur;
	}
	public Long getIdLivre() {
		return idLivre;
	}
	public void setIdLivre(Long idLivre) {
		this.idLivre = idLivre;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	
}
