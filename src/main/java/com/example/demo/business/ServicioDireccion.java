package com.example.demo.business;

import java.util.List;

import com.example.demo.entities.Direccion;
import com.example.demo.exceptions.ServicioException;

public interface ServicioDireccion{
	
	List<Direccion> listDirecciones() throws ServicioException;

	Direccion conseguirDirecciones(Integer dir_id) throws ServicioException;

	Direccion grabarDirecciones(Direccion Direccion) throws ServicioException;

	void eliminarDirecciones(Integer dir_id) throws ServicioException;
	
}

