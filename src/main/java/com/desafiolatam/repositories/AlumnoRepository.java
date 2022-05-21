package com.desafiolatam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafiolatam.models.Alumno;

/*
 * 5. Crear una interfaz llamada AlumnoRepository ​ en la carpeta ​ repository​ .
 */

public interface AlumnoRepository extends JpaRepository <Alumno, Long> {

}
