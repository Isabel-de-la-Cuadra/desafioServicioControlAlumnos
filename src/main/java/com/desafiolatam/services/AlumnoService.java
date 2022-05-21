package com.desafiolatam.services;

import java.util.List;

import com.desafiolatam.models.Alumno;

/*
 * 7. Crear una interfaz llamada AlumnoService​ en la carpeta ​ service.
- Método ​ save​ para guardar alumno.
- Método ​ findAll​ para listar alumnos.
 */

public interface AlumnoService {

	public Alumno save(Alumno alumno);
	public List<Alumno> findAll();

}
