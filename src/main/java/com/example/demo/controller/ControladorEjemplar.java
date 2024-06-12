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
import com.example.demo.business.ServicioEjemplar;
import com.example.demo.entities.Ejemplar;
import com.example.demo.exceptions.ServicioException;

@Controller
@RequestMapping(value={"/","/ejemplares"})
public class ControladorEjemplar{
	
	@Autowired
	ServicioEjemplar servicio;
	
	@GetMapping
	public String paginaEjemplares(Model model) throws Exception{
		List<Ejemplar> ejemplares = servicio.listEjemplares();
		
		model.addAttribute("ejemplares", ejemplares);	
		return "ejemplares";
	}
	
	@GetMapping("/{ejem_id}")
	public String paginaEjemplar(@PathVariable Integer ejem_id,Model model) throws Exception{
		Ejemplar ejemplar = servicio.conseguirEjemplar(ejem_id);
		
		model.addAttribute("ejemplar", ejemplar);	
		return "ejemplar";
	}

	@PostMapping
	public String grabarEjemplar(@ModelAttribute Ejemplar ejemplar,Model model) throws Exception{
		
		ejemplar=servicio.grabarEjemplar(ejemplar);
		
		model.addAttribute("ejemplar", ejemplar);	
		return "ejemplar";
	}
	
	@GetMapping("/a/{ejem_id}")
	public String eliminarEjemplar(@PathVariable Integer ejem_id,Model model) throws Exception{
		
		servicio.eliminarEjemplar(ejem_id);
		
		
		return "redirect:/ejemplares";	
	}
	@ExceptionHandler({ ServicioException.class, Exception.class })
    public String  handleException(Model model) {
		
		model.addAttribute("mensaje","Se ha producido un error");		

		return "error";
    }
}
