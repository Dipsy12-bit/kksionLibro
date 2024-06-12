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
import com.example.demo.business.ServicioUsuario;
import com.example.demo.entities.Usuario;
import com.example.demo.exceptions.ServicioException;

@Controller
@RequestMapping(value={"/","/usuarios"})
public class ControladorUsuario {
	
	@Autowired
	ServicioUsuario servicio;
	
	@GetMapping
	public String paginaUsuario(Model model) throws Exception {
		List<Usuario> usuarios = servicio.listUsuarios();
		
		model.addAttribute("usuarios", usuarios);	
		return "usuarios";
	}
	
	@GetMapping("/{usu_id}")
	public String paginaUsuario(@PathVariable Integer usu_id,Model model) throws Exception {
		Usuario usuario = servicio.conseguirUsuario(usu_id);
		
		model.addAttribute("usuario", usuario);	
		return "usuario";
	}
	
	@PostMapping
	public String grabarUsuario(@ModelAttribute Usuario usuario,Model model) throws Exception {
		
		usuario=servicio.grabarUsuario(usuario);
		
		model.addAttribute("usuario", usuario);	
		return "usuario";
	}
	
	@GetMapping("/u/{usu_id}")
	public String eliminarUsuario(@PathVariable Integer usu_id,Model model) throws Exception {
		
		servicio.eliminarUsuario(usu_id);
		
		return "redirect:/usuarios";	
	}
	
	@ExceptionHandler({ ServicioException.class, Exception.class })
    public String  handleException(Model model) {
		
		model.addAttribute("mensaje","Se ha producido un error");		

		return "error";
    }

}
