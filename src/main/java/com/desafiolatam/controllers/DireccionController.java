package com.desafiolatam.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.desafiolatam.models.Direccion;
import com.desafiolatam.models.TipoDireccion;
import com.desafiolatam.services.AlumnoService;
import com.desafiolatam.services.DireccionService;

/*
 * 12. Crear una clase DireccionController.
- Método ​ crear​ para mostrar formulario de dirección. (GET)
- Método ​ crear​ para guardar dirección. ​ (POST)
- Método ​ direcciones​ para mostrar vista de direcciones.
 */


@Controller
@RequestMapping("/direccion")
public class DireccionController {

	@Autowired
	AlumnoService alumnoService;
	
	@Autowired
	DireccionService direccionService;
	
	@RequestMapping("")
	public String mostrarFormularioDireccion(@ModelAttribute("direccion") Direccion direccion, TipoDireccion tipoDireccion, 
			Model model) {
		model.addAttribute("tipoDireccion", TipoDireccion.values());
		return "/crearDireccion.jsp";
	}
	
	@PostMapping("")
	public String guardarDireccion(@Valid @ModelAttribute("direccion") Direccion direccion, BindingResult result, 
			RedirectAttributes redirectAttributes) {
		if(!result.hasErrors()) {
			direccionService.save(direccion);
			redirectAttributes.addFlashAttribute("msgOK", "Ingresé la dirección a nuestra base de datos");
			return "redirect:/direccion";
		}else {
			redirectAttributes.addFlashAttribute("msgError", "No pude ingresar la dirección, porque faltan datos");
			return "redirect:/direccion";
		}
	}
	
	@RequestMapping("/listar")
	public String mostrarListaDirecicones(@ModelAttribute("direccion") Direccion direccion, Model model) {
		List<Direccion> listaDirecciones = direccionService.findAll();
		model.addAttribute("listaDirecciones", listaDirecciones);
		return "/direcciones.jsp";
	}
	
}
