package com.desafiolatam.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafiolatam.models.Direccion;
import com.desafiolatam.repositories.DireccionRepository;

/*
 * 10. Crear una clase llamada DireccionServiceImpl ​ en la carpeta ​ service​.
- Método ​ save​ para guardar dirección .
- Método ​ findAll para listar direcciones.
 */

@Service
public class DireccionServiceImpl implements DireccionService{

	@Autowired
	DireccionRepository direccionRepository;
	
	@Override
	public Direccion save(Direccion direccion) {
		return direccionRepository.save(direccion);
	}

	@Override
	public List<Direccion> findAll() {
		return direccionRepository.findAll();
	}

}
