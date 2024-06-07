package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="provincia")
public class Provincia{
	@Id
	@Column(name="provincia_id")
	private Integer provincia_id;
	@Column(name="nombre_provincia")
	private String nombre_provincia;
	@Column(name="direccion_provincia")
	private String direccion_provincia;
	public Integer getProvincia_id() {
		return provincia_id;
	}
	public void setProvincia_id(Integer provincia_id) {
		this.provincia_id = provincia_id;
	}
	public String getNombre_provincia() {
		return nombre_provincia;
	}
	public void setNombre_provincia(String nombre_provincia) {
		this.nombre_provincia = nombre_provincia;
	}
	public String getDireccion_provincia() {
		return direccion_provincia;
	}
	public void setDireccion_provincia(String direccion_provincia) {
		this.direccion_provincia = direccion_provincia;
	}
	@Override
	public String toString() {
		return "Provincia [provincia_id=" + provincia_id + ", nombre_provincia=" + nombre_provincia
				+ ", direccion_provincia=" + direccion_provincia + "]";
	}
	
	
	
}
