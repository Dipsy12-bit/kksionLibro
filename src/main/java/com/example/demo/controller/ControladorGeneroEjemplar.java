package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.business.ServicioGeneroEjemplar;
import com.example.demo.entities.Autor;
import com.example.demo.entities.GeneroEjemplar;
import com.example.demo.exceptions.ServicioException;

@Controller
@RequestMapping(value={"/","/genero_ejemplares"})
public class ControladorGeneroEjemplar {
	
	@Autowired
	ServicioGeneroEjemplar servicio;

	@GetMapping
	public String paginaAutores(Model model) throws Exception {
		List<GeneroEjemplar> generoEjemplar = servicio.listGeneroEjemplares();
	
		model.addAttribute("generoEjemplar", generoEjemplar);	
		return "generoEjemplar";
	}
	
	@GetMapping("/{gen_ejem_id}")
	public String paginaGeneroEjemplar(@PathVariable Integer gen_ejem_id,Model model) throws Exception {
		GeneroEjemplar generoEjemplar = servicio.conseguirGeneroEjemplar(gen_ejem_id);
		
		model.addAttribute("generoEjemplar", generoEjemplar);	
		return "generoEjemplar";
	}
	
	@PostMapping
	public String grabarGeneroEjemplar(@ModelAttribute GeneroEjemplar generoEjemplar,Model model) throws Exception {
		
		generoEjemplar=servicio.grabarGeneroEjemplar(generoEjemplar);
		
		model.addAttribute("generoEjemplar", generoEjemplar);	
		return "generoEjemplar";
	}
	
	@GetMapping("/g/{gen_ejem_id}")
	public String eliminarGeneroEjemplar(@PathVariable Integer gen_ejem_id,Model model) throws Exception {
		
		servicio.eliminarGeneroEjemplar(gen_ejem_id);
		
		return "redirect:/generoEjemplares";	
	}
	@ExceptionHandler({ ServicioException.class, Exception.class })
    public String  handleException(Model model) {
		
		model.addAttribute("mensaje","Se ha producido un error");		

		return "error";
    }
}
