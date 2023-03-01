package com.demo.crud.DTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="film_table")
public class FilmDTO implements Serializable {
	
	
	@Id
	@GenericGenerator(name="ref" , strategy="increment")
	@GeneratedValue(generator="ref")
	@Column(name="film_id")
 private int film_id;
	@Column(name="film_name")
 private String film_name;
	@Column(name="film_DirectorName")
 private String film_DirectorName;
	@Column(name="film_budget")
 private double film_budget;
	

 
 public FilmDTO()
 {
 System.out.println(this.getClass().getSimpleName()+"created");
 }


public int getFilm_id() {
	return film_id;
}


public void setFilm_id(int film_id) {
	this.film_id = film_id;
}


public String getFilm_name() {
	return film_name;
}


public void setFilm_name(String film_name) {
	this.film_name = film_name;
}


public String getFilm_DirectorName() {
	return film_DirectorName;
}


public void setFilm_DirectorName(String film_DirectorName) {
	this.film_DirectorName = film_DirectorName;
}


public double getFilm_budget() {
	return film_budget;
}


public void setFilm_budget(double film_budget) {
	this.film_budget = film_budget;
}


@Override
public String toString() {
	return "FilmDTO [film_id=" + film_id + ", film_name=" + film_name + ", film_DirectorName=" + film_DirectorName
			+ ", film_budget=" + film_budget + "]";
}
	

}
