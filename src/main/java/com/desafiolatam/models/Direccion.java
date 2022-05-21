package com.desafiolatam.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

/*
 * 3. Crear un modelo ​ Direccion​ con sus respectivas anotaciones de JPA​ y con los siguientes atributos.
- ID
- Calle
- Número
- Ciudad
- Tipo, enumeración de tipo ​ TipoDireccion
 */

@Entity
@Table(name="direcciones")
public class Direccion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min=10, max=50, message="El nombre de la calle debe tener más de 3 caracteres")
	private String calle;
	
	@NotNull
	@Range(min=1, message="El número debe tener más de 1 caracter")
	private Integer numero;
	
	@NotNull
	@Size(min=3, max=50, message="El nombre de la ciudad debe tener más de 3 caracteres")
	private String ciudad;
	
	private TipoDireccion tipo;
	
	public Direccion() {
		super();
	}

	public Direccion(Long id,
			@NotNull @Size(min = 10, max = 50, message = "El nombre de la calle debe tener más de 3 caracteres") String calle,
			@NotNull @Range(min = 1, message = "El número debe tener más de 1 caracter") Integer numero,
			@NotNull @Size(min = 3, max = 50, message = "El nombre de la ciudad debe tener más de 3 caracteres") String ciudad,
			@NotNull TipoDireccion tipo) {
		super();
		this.id = id;
		this.calle = calle;
		this.numero = numero;
		this.ciudad = ciudad;
		this.tipo = tipo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public TipoDireccion getTipo() {
		return tipo;
	}

	public void setTipo(TipoDireccion tipo) {
		this.tipo = tipo;
	}
	
}
