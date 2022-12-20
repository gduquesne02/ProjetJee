package com.univlittoral.projetback.dto;

import java.util.List;

public class HomeDTO {
	IndicateursDTO indicateurs;
	List<LivreDTO> livres;
	List<AuteurDTO> auteurs;
	
	public IndicateursDTO getIndicateurs() {
		return indicateurs;
	}
	public void setIndicateurs(IndicateursDTO indicateurs) {
		this.indicateurs = indicateurs;
	}
	public List<LivreDTO> getLivres() {
		return livres;
	}
	public void setLivres(List<LivreDTO> livres) {
		this.livres = livres;
	}
	public List<AuteurDTO> getAuteurs() {
		return auteurs;
	}
	public void setAuteurs(List<AuteurDTO> auteurs) {
		this.auteurs = auteurs;
	}

	
}
