package com.demo.crud.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.demo.crud.DTO.FilmDTO;

public class FilmDAO {

	public void save(FilmDTO dto)
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(FilmDTO.class);
		SessionFactory fact=cfg.buildSessionFactory();
		Session session= fact.openSession();
		Transaction tx=session.beginTransaction();
		try {
		session.save(dto);
		tx.commit();
	   }
	catch(Exception e) {
		
		System.out.println(e);
	}
		finally {
		session.close();
		
	}
	}	
	
	public void selectAll(int id) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(FilmDTO.class);
		SessionFactory fact=cfg.buildSessionFactory();
		Session session= fact.openSession();
		Transaction tx=session.beginTransaction();
		try {
	FilmDTO fromdb=session.get(FilmDTO.class,id);
	
		System.out.println(fromdb);
	   }
	catch(Exception e) {
		
		System.out.println(e);
	}
		finally {
		session.close();
		
	}
		
	}
	
public void update(int id,String film_name) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(FilmDTO.class);
		SessionFactory fact=cfg.buildSessionFactory();
		Session session= fact.openSession();
		Transaction tx=session.beginTransaction();
		try {
	FilmDTO fromdb=session.get(FilmDTO.class,id);
	
	
		if(fromdb!=null)
		{
			fromdb.setFilm_name(film_name);
			session.update(fromdb);
			tx.commit();
		}
	   }
	catch(Exception e) {
		
		System.out.println(e);
	}
		finally {
		session.close();
		
	}
		
	}
public void delete(int id) {
	
	Configuration cfg=new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(FilmDTO.class);
	SessionFactory fact=cfg.buildSessionFactory();
	Session session= fact.openSession();
	Transaction tx=session.beginTransaction();
	try {
FilmDTO fromdb=session.get(FilmDTO.class,id);

     session.delete(fromdb);
     tx.commit();
   }
catch(Exception e) {
	
	System.out.println(e);
}
	finally {
	session.close();
	
}
	
}

		
public  List<FilmDTO> getFilmbyDirector(String name) {
	 List<FilmDTO> fromdb=null;
	
	Configuration cfg=new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(FilmDTO.class);
	SessionFactory fact=cfg.buildSessionFactory();
	Session session= fact.openSession();
	Transaction tx=session.beginTransaction();
	try {
     Query qry=session.createQuery("select d.film_id,d.film_name,d.film_budget from filmDTO d where d.film_DirectorName='"+name+"'");

     fromdb=qry.list();
     System.out.println(fromdb);
   }
catch(Exception e) {
	
	System.out.println(e);
}
	finally {
	session.close();
	
}
	return fromdb;
}
	
}
	
	
	
	
	
	
	
	
	
	
	

