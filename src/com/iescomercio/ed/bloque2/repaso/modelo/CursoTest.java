package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import org.junit.jupiter.api.Test;

class CursoTest {

	@Test
	void testEliminarAlumno() {
		Curso c = new Curso();
		c.aniadirAlumno(new Persona("123456789","Pedro","Casas"));
		c.aniadirAlumno(new Persona("458744787","Juan","Pedro"));
		
		int numeroAlumnosAntes = c.numeroAlumnos(); //2
		try {
			c.eliminarAlumno("123456789");
		} catch (Exception e1) {
		}
		int numeroAlumnosDespues = c.numeroAlumnos(); //1
		
		assertEquals(numeroAlumnosAntes - 1, numeroAlumnosDespues);
		
		assertThrows(Exception.class, 
				()->c.eliminarAlumno("5"));
		
	}

	@Test
	void testAniadirAlumno() {
		Curso c = new Curso();
		c.aniadirAlumno(new Persona("123456789","Pedro","Casas"));
		c.aniadirAlumno(new Persona("458744787","Juan","Pedro"));
		
		int numeroAlumnosAntes = c.numeroAlumnos(); //2
		c.aniadirAlumno(new Persona("458744777","Miguel","Angel"));
		int numeroAlumnosDespues = c.numeroAlumnos(); //3
		
		assertEquals(numeroAlumnosAntes + 1, numeroAlumnosDespues);
	}

	@Test
	void testEstaRegistrado() {
		Persona p = new Persona();
		String dni = "123456789";
		ArrayList listaAlumnos= new ArrayList<Persona>();
		listaAlumnos.add(new Persona("123456789","Pedro","Casas")); //persona 1
		
		assertEquals(dni,((Persona) listaAlumnos.get(0)).getDni());
	}

	@Test
	void testCurso() {
		ArrayList<Persona>listaAlumnos= new ArrayList<Persona>();
		Curso c = new Curso();
		Persona p = new Persona("123456789","Pedro","Casas");
		c.aniadirAlumno(p);
		listaAlumnos.add(p);
		
		assertEquals(listaAlumnos.size(),c.numeroAlumnos());
	}

	@Test
	void testNumeroAlumnos() {
		Curso c = new Curso();
		c.aniadirAlumno(new Persona("123456789","Pedro","Casas"));
		int numAlumnos = c.numeroAlumnos();
		
		assertEquals(1,numAlumnos);
		
		
	}

	@Test
	void testMostrarTodos() {
		fail("Not yet implemented");
	}

}
