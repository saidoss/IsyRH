package com.isydata.recrutement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isydata.recrutement.dao.IUtilisateurDao;
import com.isydata.recrutement.entities.Utilisateur;

@Service
public class UtilisateurServiceImp implements IUtilisateurService{

	@Autowired
	private IUtilisateurDao utilisateurDao;
	
	
	@Override
	@Transactional
	public void ajouterUtilisateur(Utilisateur user) {
		this.utilisateurDao.ajouterUtilisateur(user);
		
	}

	@Override
	@Transactional
	public void updateUtilisateur(Utilisateur user) {
		this.utilisateurDao.updateUtilisateur(user);
		
	}

	@Override
	@Transactional
	public List<Utilisateur> listUtilisateur() {
		
		return this.utilisateurDao.listUtilisateur();
	}

	@Override
	@Transactional
	public Utilisateur getUtilisateurById(int id) {
		
		return this.utilisateurDao.getUtilisateurById(id);
	}

	@Override
	@Transactional
	public void removeUtilisateur(int id) {
		this.utilisateurDao.removeUtilisateur(id);
		
	}

}
