package com.isydata.recrutement.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.Query;

import com.isydata.recrutement.entities.Adresse;

@Repository
public class AdresseDaoImp implements IAdresseDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
		
	@Override
	public void AjouterAdresse(Adresse adr) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(adr);
	}

	@Override
	public void updateAdresse(Adresse adr) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(adr);
		
	}

	@Override
	public List<Adresse> listAdresse() {
		Session session = this.sessionFactory.getCurrentSession();
		String hql="select a  from Adresse a";
		List<Adresse> AdresseList= session.createQuery(hql).list();
		
		return AdresseList;
	
	}

	@Override
	public Adresse getAdresseById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Adresse adr = (Adresse) session.load(Adresse.class, new Integer(id));
		return adr;
	}

	@Override
	public void removeAdresse(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Adresse adr = (Adresse) session.load(Adresse.class, new Integer(id));
		if(null != adr){
			session.delete(adr);
		}
	}
}


