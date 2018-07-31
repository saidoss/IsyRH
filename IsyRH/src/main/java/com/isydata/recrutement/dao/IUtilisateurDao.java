package com.isydata.recrutement.dao;

import java.util.List;

import com.isydata.recrutement.entities.Utilisateur;



public interface IUtilisateurDao {
	public void ajouterUtilisateur(Utilisateur user);
	public void updateUtilisateur(Utilisateur user);
	public List<Utilisateur> listUtilisateur();
	public Utilisateur getUtilisateurById(int id);
	public void removeUtilisateur(int id);
}
