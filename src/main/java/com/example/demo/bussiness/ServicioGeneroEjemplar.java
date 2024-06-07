package com.example.demo.bussiness;

import java.util.List;

import com.example.demo.entities.GeneroEjemplar;
import com.example.demo.exceptions.ServicioException;

public interface ServicioGeneroEjemplar {
	List<GeneroEjemplar> listGeneroEjemplares() throws ServicioException;

	GeneroEjemplar conseguirGeneroEjemplar(Integer gen_ejem_id) throws ServicioException;

	GeneroEjemplar grabarGeneroEjemplar(GeneroEjemplar GeneroEjemplar) throws ServicioException;

	void eliminarGeneroEjemplar(Integer gen_ejem_id) throws ServicioException;
}