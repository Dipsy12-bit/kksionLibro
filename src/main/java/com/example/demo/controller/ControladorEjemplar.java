package com.example.demo.controller;
//h
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

import com.example.demo.bussiness.ServicioAutor;
import com.example.demo.entities.Autor;
import com.example.demo.exceptions.ServicioException;

@Controller
@RequestMapping(value={"/","/ejemplares"})
public class ControladorEjemplar {
	
	@Autowired
	ServicioAutor servicio;
	
	@GetMapping
	public String paginaAutores(Model model) throws Exception {
		List<Autor> autores = servicio.listAutores();
		
		model.addAttribute("autores", autores);	
		return "autores";
	}
	
	@GetMapping("/{autor_id}")
	public String paginaAutor(@PathVariable Integer autor_id,Model model) throws Exception {
		Autor autor = servicio.conseguirAutor(autor_id);
		
		model.addAttribute("autor", autor);	
		return "autor";
	}

	@PostMapping
	public String grabarAutor(@ModelAttribute Autor autor,Model model) throws Exception {
		
		autor=servicio.grabarAutor(autor);
		
		model.addAttribute("autor", autor);	
		return "autor";
	}
	
	@GetMapping("/a/{autor_id}")
	public String eliminarAutor(@PathVariable Integer autor_id,Model model) throws Exception {
		
		servicio.eliminarAutor(autor_id);
		
		
		return "redirect:/autores";	
	}
	@ExceptionHandler({ ServicioException.class, Exception.class })
    public String  handleException(Model model) {
		
		model.addAttribute("mensaje","Se ha producido un error");		

		return "error";
    }
}
