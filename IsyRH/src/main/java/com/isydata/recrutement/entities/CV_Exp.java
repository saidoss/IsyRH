package com.isydata.recrutement.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CV_Exp {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCV_Exp;
	
	@ManyToOne
	@JoinColumn(name="idExperience")
	private Experience experience;
	
	@ManyToOne
	@JoinColumn(name="idCv")
	private CV cv;

	public Experience getExperience() {
		return experience;
	}

	public void setExperience(Experience experience) {
		this.experience = experience;
	}

	public CV getCv() {
		return cv;
	}

	public void setCv(CV cv) {
		this.cv = cv;
	}

	public CV_Exp(Experience experience, CV cv) {
		super();
		this.experience = experience;
		this.cv = cv;
	}

	public CV_Exp() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
