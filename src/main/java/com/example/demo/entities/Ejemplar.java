package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ejemplar")
public class Ejemplar{
	@Id
	@Column(name="ejem_id")
	private Integer ejem_id;
	@Column(name="ejem_isbn")
	private Integer ejem_isbn;
	@Column(name="ejem_titulo")
	private String ejem_titulo;
	@Column(name="ejem_localizacion")
	private String ejem_localizacion;
	@Column(name="estado")
	private Integer estado;
	@Column(name="autor_id")
	private Integer autor_id;
	@Column(name="id_gen_ejem")
	private Integer id_gen_ejem;
	@Column(name="id_usu")
	private Integer id_usu;
	
	public Ejemplar(){
		super();
	}

	public Integer getEjem_id() {
		return ejem_id;
	}

	public void setEjem_id(Integer ejem_id) {
		this.ejem_id = ejem_id;
	}

	public Integer getEjem_isbn() {
		return ejem_isbn;
	}

	public void setEjem_isbn(Integer ejem_isbn) {
		this.ejem_isbn = ejem_isbn;
	}

	public String getEjem_titulo() {
		return ejem_titulo;
	}

	public void setEjem_titulo(String ejem_titulo) {
		this.ejem_titulo = ejem_titulo;
	}

	public String getEjem_localizacion() {
		return ejem_localizacion;
	}

	public void setEjem_localizacion(String ejem_localizacion) {
		this.ejem_localizacion = ejem_localizacion;
	}
	
	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Integer getAutor_id() {
		return autor_id;
	}

	public void setAutor_id(Integer autor_id) {
		this.autor_id = autor_id;
	}

	public Integer getId_gen_ejem() {
		return id_gen_ejem;
	}

	public void setId_gen_ejem(Integer id_gen_ejem) {
		this.id_gen_ejem = id_gen_ejem;
	}

	public Integer getId_usu() {
		return id_usu;
	}

	public void setId_usu(Integer id_usu) {
		this.id_usu = id_usu;
	}

	@Override
	public String toString() {
		return "Ejemplar [ejem_id=" + ejem_id + ", ejem_isbn=" + ejem_isbn + ", ejem_titulo=" + ejem_titulo
				+ ", ejem_localizacion=" + ejem_localizacion + ", estado=" + estado + ", autor_id=" + autor_id
				+ ", id_gen_ejem=" + id_gen_ejem + ", id_usu=" + id_usu + "]";
	}
}