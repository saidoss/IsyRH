package com.isydata.recrutement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isydata.recrutement.dao.ICvDao;
import com.isydata.recrutement.entities.CV;

@Service
public class CvServiceImp implements ICvService {

	@Autowired
	private ICvDao cvDao;
	
	public void setCvDao(ICvDao cvDao) {
		this.cvDao = cvDao;
	}
	@Override
	@Transactional
	public void ajouterCv(CV cv) {
		this.cvDao.ajouterCv(cv);
		
	}
	@Override
	@Transactional
	public void updateCv(CV cv) {
		this.cvDao.updateCv(cv);
	}
	@Override
	@Transactional
	public List<CV> listCv() {
		return this.cvDao.listCv();
	}
	@Override
	@Transactional
	public CV getCvById(int id) {
		return this.cvDao.getCvById(id);
	}
	@Override
	@Transactional
	public void removeCv(int id) {
	this.cvDao.removeCv(id);		
	}
	

}
