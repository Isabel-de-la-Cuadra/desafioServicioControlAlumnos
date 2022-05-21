package com.desafiolatam.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafiolatam.models.Alumno;
import com.desafiolatam.repositories.AlumnoRepository;

/*
 * 9. Crear una clase llamada AlumnoServiceImpl​ en la carpeta ​ service .
- Método ​ save​ para guardar alumno.
- Método ​ findAll para listar alumnos.
 */

@Service
public class AlumnoServiceImpl implements AlumnoService{

	@Autowired
	AlumnoRepository alumnoRepository;

	@Override
	public Alumno save(Alumno alumno) {
		return alumnoRepository.save(alumno);
	}

	@Override
	public List<Alumno> findAll() {
		return alumnoRepository.findAll();
	}

}
