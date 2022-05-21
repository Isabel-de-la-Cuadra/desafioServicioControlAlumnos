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

import com.desafiolatam.models.Alumno;
import com.desafiolatam.models.Direccion;
import com.desafiolatam.services.AlumnoService;
import com.desafiolatam.services.DireccionService;

/*
 * 11. Crear una clase AlumnoController.
- Método ​ crear​ para mostrar formulario de alumno. ​ (GET)
- Método ​ crear​ para guardar alumno. ( ​ POST)
- Método ​ alumnos​ para mostrar vista de alumnos.
 */

@Controller
@RequestMapping("/alumno")
public class AlumnoController {

	@Autowired
	AlumnoService alumnoService;
	
	@Autowired
	DireccionService direccionService;
	
	@RequestMapping("")
	public String mostrarFormularioAlumno(@ModelAttribute("alumno") Alumno alumno, 
			Direccion direccion, Model model) {
		List<Direccion> listaDirecciones = direccionService.findAll();
		model.addAttribute("listaDirecciones", listaDirecciones);
		return "/crearAlumno.jsp";
	}
	
	@PostMapping("")
	public String guardarAlumno(@Valid @ModelAttribute("alumno") Alumno alumno, BindingResult result, 
			RedirectAttributes redirectAttributes) {
		if(!result.hasErrors()) {
			alumnoService.save(alumno);
			redirectAttributes.addFlashAttribute("msgOK", "Ingresé al alumno a nuestra base de datos");
			return "redirect:/alumno";
		}else {
			redirectAttributes.addFlashAttribute("msgError", "No pude ingresar al alumno, porque faltan datos");
			return "redirect:/alumno";
		}
	}
	
	@RequestMapping("/listar")
	public String mostrarListaAlumnos(@ModelAttribute("alumno") Alumno alumno, Model model) {
		List<Alumno> listaAlumnos = alumnoService.findAll();
		model.addAttribute("listaAlumnos", listaAlumnos);
		return "/alumnos.jsp";
	}
	
}
