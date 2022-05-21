package com.desafiolatam.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

/*
 * 2. Crear un modelo ​ Alumno​ en la carpeta ​ model,​ la cual debe contener anotaciones de ​ JPA,
tener una relación de 1:1 con Dirección, y contar con los siguientes atributos:
- ID
- RUT
- Nombre
- Apellido
- Email
- Edad
- FechaIngreso
- dirección de tipo Direccion
 */


@Entity
@Table(name="alumnos")
public class Alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min=10, max=11, message="El RUT debe ir con el guión antes del dígito verificador")
	private String rut;
	
	@NotNull
	@Size(min=3, max=50, message="El nombre debe tener entre 3 y 50 caracteres")
	private String nombre;
	
	@NotNull
	@Size(min=3, max=50, message="El apellido debe tener entre 3 y 50 caracteres")
	private String apellido;
	
	@NotNull
	@Size(min=5, max=50, message="El correo debe tener entre 5 y 50 caracteres")
	private String email;
	
	@NotNull
	@Range(min=1, message="Edad fuera de rango")
	private Integer edad;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date fechaIngreso;
	
	@OneToOne(cascade= CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="direccion_id")
	private Direccion direccion;

	public Alumno() {
		super();
	}

	public Alumno(
			@NotNull @Size(min = 10, max = 11, message = "El RUT debe ir con el guión antes del dígito verificador") String rut,
			@NotNull @Size(min = 3, max = 50, message = "El nombre debe tener entre 3 y 50 caracteres") String nombre,
			@NotNull @Size(min = 3, max = 50, message = "El apellido debe tener entre 3 y 50 caracteres") String apellido,
			@NotNull @Size(min = 5, max = 50, message = "El correo debe tener entre 5 y 50 caracteres") String email,
			@NotNull @Range(min = 1, message = "Edad fuera de rango") Integer edad, Date fechaIngreso,
			Direccion direccion) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.edad = edad;
		this.fechaIngreso = fechaIngreso;
		this.direccion = direccion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
}
