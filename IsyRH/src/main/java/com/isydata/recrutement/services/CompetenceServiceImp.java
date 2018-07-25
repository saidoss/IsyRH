package com.isydata.recrutement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.isydata.recrutement.dao.ICompetenceDao;
import com.isydata.recrutement.entities.Competence;

public class CompetenceServiceImp implements ICompetenceService {

	@Autowired
	private ICompetenceDao competenceDao;
	
	
	public void setCompetenceDao(ICompetenceDao competenceDao) {
		this.competenceDao = competenceDao;
	}
	@Transactional
	@Override
	public void AjouterCompetence(Competence competence) {
		this.competenceDao.AjouterCompetence(competence);
		
	}
	@Transactional
	@Override
	public void updateCompetence(Competence competence) {
		this.competenceDao.updateCompetence(competence);
	
	}
	@Transactional
	@Override
	public List<Competence> listCompetence() {
		return this.competenceDao.listCompetence();
	}
	@Transactional
	@Override
	public Competence getCompetenceById(int id) {
		
		return this.competenceDao.getCompetenceById(id);
	}
	@Transactional
	@Override
	public void removeCompetence(int id) {
		this.competenceDao.removeCompetence(id);
		
	}

}
