package com.example.demo.bussiness;

import java.util.List;

import com.example.demo.entities.Ejemplar;
import com.example.demo.exceptions.ServicioException;

public interface ServicioEjemplar {
	List<Ejemplar> listEjemplares() throws ServicioException;

	Ejemplar conseguirEjemplar(Integer ejem_id) throws ServicioException;

	Ejemplar grabarEjemplar(Ejemplar ejemplar) throws ServicioException;

	void eliminarEjemplar(Integer ejem_id) throws ServicioException;
}
