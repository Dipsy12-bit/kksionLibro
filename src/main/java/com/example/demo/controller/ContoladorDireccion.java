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
import com.example.demo.business.ServicioDireccion;
import com.example.demo.entities.Direccion;
import com.example.demo.exceptions.ServicioException;

@Controller
@RequestMapping(value={"/","/direcciones"})
public class ContoladorDireccion {
	
	@Autowired
	ServicioDireccion servicio;
	
	@GetMapping
	public String paginaDirecciones(Model model) throws Exception {
		List<Direccion> direcciones = servicio.listDirecciones();
		
		model.addAttribute("direcciones", direcciones);	
		return "direcciones";
	}
	
	@GetMapping("/{dir_id}")
	public String paginaDirecciones(@PathVariable Integer dir_id,Model model) throws Exception {
		Direccion direccion = servicio.conseguirDirecciones(dir_id);
		
		model.addAttribute("direccion", direccion);	
		return "direccion";
	}
	
	@PostMapping
	public String grabarDirecciones(@ModelAttribute Direccion direccion,Model model) throws Exception {
		
		direccion=servicio.grabarDirecciones(direccion);
		
		model.addAttribute("direccion", direccion);	
		return "direccion";
	}
	
	@GetMapping("/d/{dir_id}")
	public String eliminarDirecciones(@PathVariable Integer dir_id,Model model) throws Exception {
		
		servicio.eliminarDirecciones(dir_id);
		
		return "redirect:/direcciones";	
	}
	
	@ExceptionHandler({ ServicioException.class, Exception.class })
    public String  handleException(Model model) {
		
		model.addAttribute("mensaje","Se ha producido un error");		

		return "error";
    }

}
