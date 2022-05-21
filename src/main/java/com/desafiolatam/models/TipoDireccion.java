package com.desafiolatam.models;

/*
 * 4. Crear una enumeración ​ TipoDireccion​ , con los siguientes valores.
- CASA
- TRABAJO
- OTRO
 */

public enum TipoDireccion {
	CASA ("Casa"), 
	TRABAJO ("Trabajo"), 
	OTRO ("Otro");
	
	private final String tipo;
	
	TipoDireccion(String tipo){
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
}