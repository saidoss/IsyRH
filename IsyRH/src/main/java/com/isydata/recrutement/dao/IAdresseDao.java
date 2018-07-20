package com.isydata.recrutement.dao;

import java.util.List;

import com.isydata.recrutement.entities.Adresse;


public interface IAdresseDao {
	public void AjouterAdresse(Adresse adr);
	public void updateAdresse(Adresse adr);
	public List<Adresse> listAdresse();
	public Adresse getAdresseById(int id);
	public void removeAdresse(int id);

}
