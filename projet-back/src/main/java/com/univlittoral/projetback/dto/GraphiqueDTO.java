package com.univlittoral.projetback.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.univlittoral.projetback.entity.LivreEntity;
import com.univlittoral.projetback.enums.enumColors;

public class GraphiqueDTO {

	private String labels;
	@Enumerated(EnumType.STRING)
	private enumColors colors;
	private LivreEntity values;
	
	public String getLabels() {
		return labels;
	}
	public void setLabels(String labels) {
		this.labels = labels;
	}

	public enumColors getColors() {
		return colors;
	}
	public void setColors(enumColors colors) {
		this.colors = colors;
	}
	public LivreEntity getValues() {
		return values;
	}
	public void setValues(LivreEntity values) {
		this.values = values;
	}
	
	
}
