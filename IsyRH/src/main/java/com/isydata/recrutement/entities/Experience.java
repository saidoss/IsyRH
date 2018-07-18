package com.isydata.recrutement.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Experience {

	

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idExperience;
	private String nomEntreprise;
	private String dur�eMission;
	private String description;
	
	
	@OneToMany(mappedBy="experience")
	private Collection<CV_Exp> cv_Exps;
	
	
	public Experience(int idExperience, String nomEntreprise, String dur�eMission, String description,
			Collection<CV_Exp> cv_Exps) {
		super();
		this.idExperience = idExperience;
		this.nomEntreprise = nomEntreprise;
		this.dur�eMission = dur�eMission;
		this.description = description;
		this.cv_Exps = cv_Exps;
	}


	public Experience() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getIdExperience() {
		return idExperience;
	}


	public void setIdExperience(int idExperience) {
		this.idExperience = idExperience;
	}


	public String getNomEntreprise() {
		return nomEntreprise;
	}


	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}


	public String getDur�eMission() {
		return dur�eMission;
	}


	public void setDur�eMission(String dur�eMission) {
		this.dur�eMission = dur�eMission;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Collection<CV_Exp> getCv_Exps() {
		return cv_Exps;
	}


	public void setCv_Exps(Collection<CV_Exp> cv_Exps) {
		this.cv_Exps = cv_Exps;
	}
	
	
	
}
