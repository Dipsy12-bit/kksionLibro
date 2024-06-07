package com.example.demo.bussiness;

import java.util.List;

import com.example.demo.entities.Provincia;
import com.example.demo.exceptions.ServicioException;

public interface ServicioProvincia {
	List<Provincia> listProvincias() throws ServicioException;

	Provincia conseguirProvincia(Integer provincia_id) throws ServicioException;

	Provincia grabarProvincia(Provincia Provincia) throws ServicioException;

	void eliminarProvincia(Integer provincia_id) throws ServicioException;
}
