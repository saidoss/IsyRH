package com.isydata.recrutement;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.isydata.recrutement.entities.Adresse;
import com.isydata.recrutement.entities.CV;
import com.isydata.recrutement.entities.Candidat;
import com.isydata.recrutement.entities.CategorieCompetence;
import com.isydata.recrutement.entities.Competence;
import com.isydata.recrutement.entities.Experience;
import com.isydata.recrutement.services.IAdresseService;
import com.isydata.recrutement.services.ICandidatService;
import com.isydata.recrutement.services.ICategorieCompetenceService;
import com.isydata.recrutement.services.ICompetenceService;
import com.isydata.recrutement.services.ICvService;
import com.isydata.recrutement.services.IExperienceService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private IAdresseService adresseService;
	@Autowired
	private ICandidatService candidatService;
	@Autowired
	private ICategorieCompetenceService categorieService;
    @Autowired
	private ICompetenceService comptenceService;
	@Autowired
	private ICvService cvService;
	@Autowired
	private IExperienceService experienceService;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
	

	
			Adresse add1 = new Adresse("51", "Boulevard Foch", "93800", "Epinay sur seine");
			Adresse add2 = new Adresse("52", "Boulevard Foch", "93800", "Epinay sur seine");
			Adresse add3 = new Adresse("53", "Boulevard Foch", "93800", "Epinay sur seine");
			adresseService.ajouterAdresse(add1);
		adresseService.ajouterAdresse(add2);
		adresseService.ajouterAdresse(add3);
			
			
		Candidat cand1= new Candidat("arkoub", "syfax", "555", "ooooo", "immediat", "national", "oui", add1);
			Candidat cand2= new Candidat("ouazene", "ferhat", "555", "ooooo", "immediat", "national", "oui", add2);
			Candidat cand3= new Candidat("menasri", "said", "555", "ooooo", "immediat", "national", "oui", add3);
			Candidat cand4= new Candidat("messaoudene", "mounir", "555", "ooooo", "immediat", "national", "oui", add3);
			
		candidatService.ajouterCandidat(cand1);
		candidatService.ajouterCandidat(cand2);
		candidatService.ajouterCandidat(cand3);
		candidatService.ajouterCandidat(cand4);
			
			CategorieCompetence cat1= new CategorieCompetence("Informatique");
			CategorieCompetence cat2= new CategorieCompetence("methode");
			categorieService.ajouterCategoieCompetence(cat1);
			categorieService.ajouterCategoieCompetence(cat2);
			
			Competence comp1= new Competence("java", cat1);
			Competence comp2= new Competence("agile", cat1);
			
			comptenceService.ajouterCompetence(comp1);
			comptenceService.ajouterCompetence(comp2);
			
			Experience exp1= new Experience("isydata", "1 an", "developpement");
			Experience exp2= new Experience("isydataaa", "1 an", "developpement");
			Experience exp3= new Experience("isydata", "1 an", "developpement");
			Experience exp4= new Experience("isydata", "1 an", "developpement");
			Experience exp5= new Experience("isydata", "1 an", "developpement");
			
			experienceService.ajouterExperience(exp1);
			experienceService.ajouterExperience(exp2);
			experienceService.ajouterExperience(exp3);
			experienceService.ajouterExperience(exp4);
			experienceService.ajouterExperience(exp5);
			
			
			
		ArrayList<Experience> a = new ArrayList<Experience>();
		a.add(exp1); a.add(exp2);
		ArrayList<Experience> b = new ArrayList<Experience>();
		b.add(exp3);
		ArrayList<Experience> c = new ArrayList<Experience>();
		c.add(exp4);
		ArrayList<Experience> d = new ArrayList<Experience>();
		d.add(exp5);
		ArrayList<Competence> co = new ArrayList<Competence>();
		co.add(comp1); co.add(comp2);
					
			CV cv1= new CV("pro", "doc", "indeed", 1, "walou", false, cand1, a, co);
			CV cv2= new CV("pro", "doc", "indeed", 1, "walou", false, cand2, b, co);
		    CV cv3= new CV("pro", "doc", "indeed", 1, "walou", false, cand3, c, co);
			CV cv4= new CV("pro", "doc", "indeed", 1, "walou", false, cand4, d, co);
		
		cvService.ajouterCv(cv1);
		cvService.ajouterCv(cv2);
		cvService.ajouterCv(cv3);
		cvService.ajouterCv(cv4);
		

			
			
		
		

		
		
		
		return "home";
	}
	
}
