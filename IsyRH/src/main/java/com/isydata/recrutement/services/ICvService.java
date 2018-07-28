package com.isydata.recrutement.services;
import java.util.List;

import com.isydata.recrutement.entities.CV;

public interface ICvService {



	public void ajouterCv(CV cv);
	public void updateCv(CV cv);
	public List<CV> listCv();
	public CV getCvById(int id);
	public void removeCv(int id);


}
