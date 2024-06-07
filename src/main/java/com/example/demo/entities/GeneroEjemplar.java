package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="gen_ejemplar")
public class GeneroEjemplar {
	
		@Id
		@Column(name="gen_ejem_id")
		private Integer gen_ejem_id;
		@Column(name="nombre_ejem")
		private String nombre_ejem;
		
		public Integer getGen_ejem_id() {
			return gen_ejem_id;
		}
		public void setGen_ejem_id(Integer gen_ejem_id) {
			this.gen_ejem_id = gen_ejem_id;
		}
		public String getNombre_ejem() {
			return nombre_ejem;
		}
		public void setNombre_ejem(String nombre_ejem) {
			this.nombre_ejem = nombre_ejem;
		}
		@Override
		public String toString() {
			return "GenEjemplar [gen_ejem_id=" + gen_ejem_id + ", nombre_ejem=" + nombre_ejem + "]";
		}
		
		
}

