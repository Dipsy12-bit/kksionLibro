package com.example.demo.bussiness;

import java.util.List;

import com.example.demo.entities.Usuario;
import com.example.demo.exceptions.ServicioException;

public interface ServicioUsuario{
	List<Usuario> listUsuarios() throws ServicioException;

	Usuario conseguirUsuario(Integer usu_id) throws ServicioException;

	Usuario grabarUsuario(Usuario Usuario) throws ServicioException;

	void eliminarUsuario(Integer usu_id) throws ServicioException;
}
