package com.example.demo.business;

import java.util.List;

import com.example.demo.entities.DatosUsuario;
import com.example.demo.exceptions.ServicioException;

public interface ServicioDatosUsuario{
	
	List<DatosUsuario> listDatosUsuario() throws ServicioException;

	DatosUsuario conseguirDatosUsuario(Integer usu_id) throws ServicioException;

	DatosUsuario grabarDatosUsuario(DatosUsuario datosUsuario) throws ServicioException;

	void eliminarDatosUsuario(Integer usu_id) throws ServicioException;
	
}
