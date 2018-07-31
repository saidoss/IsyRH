package com.isydata.recrutement.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.isydata.recrutement.entities.Utilisateur;

@Repository
public class UtilisateurDaoImp implements IUtilisateurDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	@Override
	public void ajouterUtilisateur(Utilisateur user) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(user);
	
	}

	@Override
	public void updateUtilisateur(Utilisateur user) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(user);
		
	}

	@Override
	public List<Utilisateur> listUtilisateur() {
		Session session = this.sessionFactory.getCurrentSession();
		String hql="select u  from Utilisateur u";
		List<Utilisateur> UtilisateurList= session.createQuery(hql).list();
		
		return UtilisateurList;
	}

	@Override
	public Utilisateur getUtilisateurById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Utilisateur user = (Utilisateur) session.load(Utilisateur.class, new Integer(id));
		return user;
	}

	@Override
	public void removeUtilisateur(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Utilisateur user = (Utilisateur) session.load(Utilisateur.class, new Integer(id));
		if(null != user){
			session.delete(user);
		}
	}
	}

