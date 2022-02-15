package com.iescomercio.ed.bloque2.repaso.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	private List<Persona> listaAlumnos;

	/**
	 * Función que elimina a un alumno del curso
	 * 
	 * @param dni Identificador único de la persona que se quiere eliminar
	 * @throws Exception El dni no tiene la longitud adecuada de 9 caracteres
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if(dni.length()==9) {//comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); //solo hace falta el dni
		}else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}
	
	/**
	 * Función que añade una persona al curso
	 * 
	 * @param p Objeto Persona que se quiere añadir al curso
	 */
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}
	
	/**
	 * Función que comprueba si el DNI de una persona está registrado en el curso
	 * 
	 * @param dni Identificador único de la persona que se quiere buscar
	 * @return Verdadero si esta registrado dicho dni, falso en caso contrario
	 */
	public Boolean estaRegistrado(String dni) {
		int i =0;
		Boolean encontrado=false;
		while (!encontrado && i<listaAlumnos.size()) {
			if(listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado=true;
			}
			i++;
		}
		return encontrado;
	}
	
	/**
	 *  Constructor que inicializa la lista de alumnos del curso
	 */
	public Curso() {
		listaAlumnos= new ArrayList<Persona>();
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	public Integer numeroAlumnos() {return listaAlumnos.size();}
	
	
	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
