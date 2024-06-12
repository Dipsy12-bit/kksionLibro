package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="direccion")
public class Direccion{
	@Id
	@Column(name="dir_id")
	private Integer dir_id;
	@Column(name="dir_nombre")
	private String dir_nombre;
	@Column(name="provincia")
	private String provincia;
	
	public Integer getDir_id() {
		return dir_id;
	}
	public void setDir_id_id(Integer dir_id) {
		this.dir_id=dir_id;
	}
	public String getDir_nombre() {
		return dir_nombre;
	}
	public void setNombre_provincia(String dir_nombre) {
		this.dir_nombre=dir_nombre;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia=provincia;
	}
	@Override
	public String toString() {
		return "Direccion [dir_id=" + dir_id + ", dir_nombre=" + dir_nombre
				+ ", provincia=" + provincia + "]";
	}
	
	
	
}
