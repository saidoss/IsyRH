package com.isydata.recrutement.services;
import java.util.List;

import com.isydata.recrutement.entities.Utilisateur;

public interface IUtilisateurService {

	public void AjouterUtilisateur(Utilisateur user);
	public void updateUtilisateur(Utilisateur user);
	public List<Utilisateur> listUtilisateur();
	public Utilisateur getUtilisateurById(int id);
	public void removeUtilisateur(int id);
}
