package com.univlittoral.projetback.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity // => Pour que votre application Spring boot sache que cette classe est une entité
@Table(name="auteurs") //=> le nom de la table de votre base de données associée à cet objet Entité.
public class AuteurEntity {

		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToMany(targetEntity=LivreEntity.class, mappedBy="auteur",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private List<LivreEntity> livres;


	private String dateNaissance;
	private String prenom;
	private String nom;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<LivreEntity> getLivres() {
		return livres;
	}
	public void setLivres(List<LivreEntity> livres) {
		this.livres = livres;
	}
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
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
	
	


		
}
