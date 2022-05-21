package com.desafiolatam.services;

import java.util.List;

import com.desafiolatam.models.Direccion;

/*
 * 8. Crear una interfaz llamada DireccionService en la carpeta​ service​ .
- Método ​ save​ para guardar dirección.
- Método​ findAll ​ para listar direcciones.
*/

public interface DireccionService {

	public Direccion save(Direccion direccion);
	public List<Direccion> findAll();
	
}
