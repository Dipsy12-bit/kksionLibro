package com.example.demo.bussiness;

import java.util.List;

import com.example.demo.entities.Autor;
import com.example.demo.exceptions.ServicioException;

public interface ServicioAutor {
	
	List<Autor> listAutores() throws ServicioException;

	Autor conseguirAutor(Integer autor_id) throws ServicioException;

	Autor grabarAutor(Autor autor) throws ServicioException;

	void eliminarAutor(Integer autor_id) throws ServicioException;
}
