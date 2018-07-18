package com.isydata.recrutement.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Competence {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCompetence;
	private String competence;
	private String langue;
	
	
	@ManyToOne
	@JoinColumn(name="idCategorie")
	private CategorieComp categorieComp;
	
	@OneToMany(mappedBy="competence")
	private Collection<CV_Comp> cv_Comps;
	
	



	public Competence(int idCompetence, String competence, String langue, CategorieComp categorieComp) {
		super();
		this.idCompetence = idCompetence;
		this.competence = competence;
		this.langue = langue;
		this.categorieComp = categorieComp;
	}


	public Competence() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CategorieComp getCategorieComp() {
		return categorieComp;
	}


	public void setCategorieComp(CategorieComp categorieComp) {
		this.categorieComp = categorieComp;
	}


	public int getIdCompetence() {
		return idCompetence;
	}


	public void setIdCompetence(int idCompetence) {
		this.idCompetence = idCompetence;
	}


	public String getCompetence() {
		return competence;
	}


	public void setCompetence(String competence) {
		this.competence = competence;
	}


	public String getLangue() {
		return langue;
	}


	public void setLangue(String langue) {
		this.langue = langue;
	}
	
	
	
	
	
}