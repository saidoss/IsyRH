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
public class CV {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCv;
	private String titreIsyData;
	private String titreCandidat;
	private String siteSource;
	private int flag;
	private String observation;
	private boolean entretien; 
	
	@ManyToOne
	@JoinColumn(name="idCandidat")
	private Candidat candidat;
	
	@OneToMany(mappedBy="cv")
	private Collection<CV_Comp> cv_Comps;
	
	@OneToMany(mappedBy="cv")
	private Collection<CV_Exp> cv_Exps;

	public int getIdCv() {
		return idCv;
	}

	public void setIdCv(int idCv) {
		this.idCv = idCv;
	}

	public String getTitreIsyData() {
		return titreIsyData;
	}

	public void setTitreIsyData(String titreIsyData) {
		this.titreIsyData = titreIsyData;
	}

	public String getTitreCandidat() {
		return titreCandidat;
	}

	public void setTitreCandidat(String titreCandidat) {
		this.titreCandidat = titreCandidat;
	}

	public String getSiteSource() {
		return siteSource;
	}

	public void setSiteSource(String siteSource) {
		this.siteSource = siteSource;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public boolean isEntretien() {
		return entretien;
	}

	public void setEntretien(boolean entretien) {
		this.entretien = entretien;
	}

	public Candidat getCandidat() {
		return candidat;
	}

	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}

	public Collection<CV_Comp> getCv_Comps() {
		return cv_Comps;
	}

	public void setCv_Comps(Collection<CV_Comp> cv_Comps) {
		this.cv_Comps = cv_Comps;
	}

	public Collection<CV_Exp> getCv_Exps() {
		return cv_Exps;
	}

	public void setCv_Exps(Collection<CV_Exp> cv_Exps) {
		this.cv_Exps = cv_Exps;
	}

	public CV(int idCv, String titreIsyData, String titreCandidat, String siteSource, int flag, String observation,
			boolean entretien, Candidat candidat, Collection<CV_Comp> cv_Comps, Collection<CV_Exp> cv_Exps) {
		super();
		this.idCv = idCv;
		this.titreIsyData = titreIsyData;
		this.titreCandidat = titreCandidat;
		this.siteSource = siteSource;
		this.flag = flag;
		this.observation = observation;
		this.entretien = entretien;
		this.candidat = candidat;
		this.cv_Comps = cv_Comps;
		this.cv_Exps = cv_Exps;
	}

	public CV() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
