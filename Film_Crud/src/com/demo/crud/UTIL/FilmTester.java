package com.demo.crud.UTIL;


import java.util.List;

import com.demo.crud.DAO.FilmDAO;
import com.demo.crud.DTO.FilmDTO;

public class FilmTester {
	public static void main(String[]args)
	{
	FilmDTO dto=new FilmDTO();
	dto.setFilm_name("gold");
	dto.setFilm_DirectorName("alphones");
	dto.setFilm_budget(15000000);
	
	FilmDAO dao=new FilmDAO();
	//dao.save(dto);
	//dao.selectAll(2);
	//dao.update(2," K.G.F");
	//dao.delete(1);
	//System.out.println("deleted successfully");
	List<FilmDTO> f=dao.getFilmbyDirector("vineeth");
	for(FilmDTO d)
	
	}

}
