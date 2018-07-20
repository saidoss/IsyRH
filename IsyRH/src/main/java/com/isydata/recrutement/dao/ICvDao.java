package com.isydata.recrutement.dao;

import java.util.List;

import com.isydata.recrutement.entities.CV;


public interface ICvDao {

	public void AjouterCv(CV cv);
	public void updateCv(CV cv);
	public List<CV> listCv();
	public CV getCvById(int id);
	public void removeCv(int id);
}
