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
	public CV(int idCv, String titreIsyData, String titreCandidat, String siteSource) {
		super();
		this.idCv = idCv;
		this.titreIsyData = titreIsyData;
		this.titreCandidat = titreCandidat;
		this.siteSource = siteSource;
	}
	public CV() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
