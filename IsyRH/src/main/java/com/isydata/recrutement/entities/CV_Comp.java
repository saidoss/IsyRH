package com.isydata.recrutement.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CV_Comp {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCV_Comp;
	
	@ManyToOne
	@JoinColumn(name="idCompetence")
	private Competence competence;
	
	@ManyToOne
	@JoinColumn(name="idCv")
	private CV cv;

	
	
	public Competence getCompetence() {
		return competence;
	}

	public void setCompetence(Competence competence) {
		this.competence = competence;
	}

	public CV getCv() {
		return cv;
	}

	public void setCv(CV cv) {
		this.cv = cv;
	}

	public CV_Comp(Competence competence, CV cv) {
		super();
		this.competence = competence;
		this.cv = cv;
	}

	public CV_Comp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
