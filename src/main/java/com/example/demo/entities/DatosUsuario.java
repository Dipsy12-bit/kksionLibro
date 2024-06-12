package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="datos_usuario")
public class DatosUsuario {
	@Id
	@Column(name="autor_id")
	private Integer autor_id;
	@Column(name="usu_nombre")
	private String usu_nombre;
	@Column(name="usu_apellido")
	private String usu_apellido;
	@Column(name="dir_id")
	private String dir_id;
	
	public Integer getAutor_id(){
		return autor_id;
	}
	
	public void setAutor_id(Integer autor_id){
		this.autor_id=autor_id;
	}
	
	public String getUsu_nombre(){
		return usu_nombre;
	}
	
	public void setUsu_nombre(String usu_nombre){
		this.usu_nombre=usu_nombre;
	}
	
	public String getUsu_apellido(){
		return usu_apellido;
	}
	
	public void setUsu_apellido(String usu_apellido){
		this.usu_apellido=usu_apellido;
	}
	
	public String getDir_id(){
		return dir_id;
	}
	
	public void setDir_id(String dir_id){
		this.dir_id=dir_id;
	}
	
	@Override
	public String toString(){
		return "DatosUsuario [autor_id=" + autor_id + ", usu_nombre=" + usu_nombre + ", usu_apellido=" + usu_apellido
				+ ", dir_id=" + dir_id + "]";
	}
}
