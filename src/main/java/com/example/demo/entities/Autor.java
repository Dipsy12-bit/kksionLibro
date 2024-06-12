package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="autor")
public class Autor {
	@Id
	@Column(name="autor_id")
	private Integer autor_id;
	@Column(name="nombre_autor")
	private String nombre_autor;
	
	public Integer getAutor_id(){
		return autor_id;
	}
	
	public void setAutor_id(Integer autor_id){
		this.autor_id=autor_id;
	}
	
	public String getNombre_autor(){
		return nombre_autor;
	}
	
	public void setNombre_autor(String nombre_autor){
		this.nombre_autor=nombre_autor;
	}
	
	@Override
	public String toString(){
		return "Autor [autor_id=" + autor_id + ", nombre_autor=" + nombre_autor + "]";
	}
}
