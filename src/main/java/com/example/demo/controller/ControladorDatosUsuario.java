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
import com.example.demo.business.ServicioDatosUsuario;
import com.example.demo.entities.DatosUsuario;
import com.example.demo.exceptions.ServicioException;

@Controller
@RequestMapping(value={"/","/datos_usuario"})
public class ControladorDatosUsuario{
	
	@Autowired
	ServicioDatosUsuario servicio;

	@GetMapping
	public String paginaDatosUsuario(Model model) throws Exception{
		List<DatosUsuario> datosUsuarios=servicio.listDatosUsuario();
		
		model.addAttribute("datosUsuarios", datosUsuarios);	
		return "datosUsuarios";
	}
	
	@GetMapping("/{usu_id}")
	public String paginaDatosUsuario(@PathVariable Integer usu_id,Model model) throws Exception {
		DatosUsuario datosUsuario = servicio.conseguirDatosUsuario(usu_id);
		
		model.addAttribute("datosUsuario", datosUsuario);	
		return "datosUsuario";
	}
	
	@PostMapping
	public String grabarDatosUsuario(@ModelAttribute DatosUsuario datosUsuario,Model model) throws Exception {
		
		datosUsuario=servicio.grabarDatosUsuario(datosUsuario);
		
		model.addAttribute("datosUsuario", datosUsuario);	
		return "datosUsuario";
	}
	
	@GetMapping("/u/{usu_id}")
	public String eliminarDatosUsuario(@PathVariable Integer usu_id,Model model) throws Exception {
		
		servicio.eliminarDatosUsuario(usu_id);
		
		return "redirect:/datos_usuario";	
	}
	
	@ExceptionHandler({ ServicioException.class, Exception.class })
    public String  handleException(Model model) {
		
		model.addAttribute("mensaje","Se ha producido un error");		

		return "error";
    }
}
