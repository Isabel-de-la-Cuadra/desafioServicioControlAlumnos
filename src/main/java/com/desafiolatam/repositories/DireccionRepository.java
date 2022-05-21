package com.desafiolatam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafiolatam.models.Direccion;

/*
 * 6. Crear una interfaz llamada DireccionRepository​ en la carpeta repository.
 */

public interface DireccionRepository extends JpaRepository <Direccion, Long>{

}
