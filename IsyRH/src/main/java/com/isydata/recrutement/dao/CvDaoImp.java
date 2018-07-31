package com.isydata.recrutement.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.isydata.recrutement.entities.CV;


@Repository
public class CvDaoImp implements ICvDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	@Override
	public void ajouterCv(CV cv) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(cv);
	}

	@Override
	public void updateCv(CV cv) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(cv);
		
	}

	@Override
	public List<CV> listCv(int idflag) {
		Session session = this.sessionFactory.getCurrentSession();
		String hql="select c from CV c ";
		List<CV> CvList= session.createQuery(hql).list();
		
		return CvList;
	}

	@Override
	public CV getCvById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		CV cv = (CV) session.load(CV.class, new Integer(id));
		return cv;
	}

	@Override
	public void removeCv(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		CV cv = (CV) session.load(CV.class, new Integer (id));
		if(null != cv) {
			session.delete(cv);
		}
		
	}

}
