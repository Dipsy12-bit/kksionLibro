package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario{
	@Id
	@Column(name="usu_id")
	private Integer usu_id;
	@Column(name="usu_correo")
	private String usu_correo;
	@Column(name="usu_contrasenia")
	private String usu_contrasenia;
	
	
	public Usuario(){
		super();
	}

	public Integer getUsu_id(){
		return usu_id;
	}

	public void setUsu_id(Integer usu_id){
		this.usu_id = usu_id;
	}

	public String getUsu_correo(){
		return usu_correo;
	}

	public void setUsu_correo(String usu_correo){
		this.usu_correo=usu_correo;
	}

	public String getUsu_contrasenia(){
		return usu_contrasenia;
	}

	public void setUsu_contrasenia(String usu_contrasenia){
		this.usu_contrasenia=usu_contrasenia;
	}

	@Override
	public String toString() {
		return "Usuario [usu_id=" + usu_id + ", usu_correo=" + usu_correo + ", usu_contrasenia=" + usu_contrasenia + "]";
	}



	
	
}