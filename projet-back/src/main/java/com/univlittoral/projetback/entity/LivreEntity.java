package com.univlittoral.projetback.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.univlittoral.projetback.enums.enumGenre;

@Entity // => Pour que votre application Spring boot sache que cette classe est une entité
@Table(name="livres") //=> le nom de la table de votre base de données associée à cet objet Entité.
public class LivreEntity {

		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idLivre")
	private Long id;
	private String lieuParution;
	private String dateParution;
	@ManyToOne()
    @JoinColumn(name="auteur", referencedColumnName = "id")    
    private AuteurEntity auteur;

	private String editeur;
	@Enumerated(EnumType.STRING)
	private enumGenre genre;
	@Column(name="pages")
	private Integer nbPages;
	private String nom;
	
	
	

	


	public AuteurEntity getAuteur() {
		return auteur;
	}
	public void setAuteur(AuteurEntity auteur) {
		this.auteur = auteur;
	}
	public Integer getNbPages() {
		return nbPages;
	}
	public void setNbPages(Integer nbPages) {
		this.nbPages = nbPages;
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

	public String getNom() {
		return nom;
	}
	public void setNom(String nomLivre) {
		this.nom = nomLivre;
	}


		
}
