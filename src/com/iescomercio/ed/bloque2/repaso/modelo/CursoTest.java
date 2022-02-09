package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CursoTest {

	@Test
	void testEliminarAlumno() {
		fail("Not yet implemented");
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
		fail("Not yet implemented");
	}

	@Test
	void testCurso() {
		fail("Not yet implemented");
	}

	@Test
	void testNumeroAlumnos() {
		fail("Not yet implemented");
	}

	@Test
	void testMostrarTodos() {
		fail("Not yet implemented");
	}

}
