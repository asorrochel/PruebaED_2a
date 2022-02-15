package com.iescomercio.ed.bloque2.repaso.modelo;

public class Persona{
	
	private String dni;
	private String nombre;
	private String apellido1;
	
	public Persona() {}
	
	/**
	 * Constructor que inicializa el objeto "persona" asignando los siguientes valores [dni,nombre,apellido1]
	 * 
	 * @param dni Identificador único de la persona
	 * @param nombre Nombre de la persona
	 * @param apellido1 Primer apellido de la persona
	 */
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}
	
	/**
	 * Devuelve el DNI del persona especificada
	 * 
	 * @return dni Identificador único de la persona
	 */
	public String getDni() {
		return dni;
	}
	
	
	/**
	 * Establecer el DNI a una persona
	 * 
	 * @param dni Identificador único de la persona
	 * @throws Exception El ultimo caracter introducido no es una letra
	 */
	public void setDni(String dni) throws Exception {
		//comprobacion de si el ultimo caracter es una letra
		if(Character.isLetter(dni.charAt(dni.length()))) {
			this.dni=dni;
		}else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}
	
	/**
	 * Devuelve el Nombre de la persona especificada
	 * 
	 * @return Nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Establecer el Nombre a una persona
	 * 
	 * @param nombre Nombre de la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	public String getApellido1() {
		return apellido1;
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	

}
