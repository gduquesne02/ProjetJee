package com.univlittoral.projetback.dto;

import java.util.List;
import java.util.Map;

public class HomeDTO {
	
	private List<LivreDTO> livre;
	private IndicateursDTO indicateurs;
    private Map<String,Integer> genres;
	private GraphiqueDTO datasGraph;
		    
	    
	    public List<LivreDTO> getLivres() {
	        return livre;
	    }
	    public void setLivres(List<LivreDTO> livre) {
	        this.livre = livre;
	    }
	    
		public IndicateursDTO getIndicateurs() {
			return indicateurs;
		}
		public void setIndicateurs(IndicateursDTO indicateurs) {
			this.indicateurs = indicateurs;
		}
		public List<LivreDTO> getLivre() {
			return livre;
		}
		public void setLivre(List<LivreDTO> livre) {
			this.livre = livre;
		}
		public Map<String, Integer> getGenres() {
			return genres;
		}
		public void setGenres(Map<String, Integer> genres) {
			this.genres = genres;
		}
		public GraphiqueDTO getDatasGraph() {
			return datasGraph;
		}
		public void setDatasGraph(GraphiqueDTO datasGraph) {
			this.datasGraph = datasGraph;
		}
		



}
