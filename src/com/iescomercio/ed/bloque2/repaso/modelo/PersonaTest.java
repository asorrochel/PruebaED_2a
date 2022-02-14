package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

	@Test
	void testPersonaStringStringString() {
		Persona p1 = new Persona ("12345678A", "Adrian", "Sorroche");
		Persona p2 = new Persona ("87457477L", "Pablo", "Gil");
	}

	@Test
	void testGetDni() {
		Persona p1 = new Persona ("12345678A", "Adrian", "Sorroche");
		String dni = p1.getDni();
		String dniEsperado = "12345678A";
		
		assertEquals(dniEsperado,dni);
		
	}

	@Test
	void testSetDni() {
		Persona p1 = new Persona ();
		
		try {
			p1.setDni("12345678A");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String dni = p1.getDni();
		String dniEsperado = "12345678A";
		
		assertEquals(dniEsperado,dni);
		
		Exception e = assertThrows(Exception.class, ()->p1.setDni("004741"));
		assertEquals(e.getMessage(), "El ultimo caracter introducido no es una letra");
	}

	@Test
	void testGetNombre() {
		Persona p1 = new Persona ("12345678A", "Adrian", "Sorroche");
		String nombre = p1.getNombre();
		String nombreEsperado = "Adrian";
		
		assertEquals(nombreEsperado,nombre);
	}

	@Test
	void testSetNombre() {
		Persona p1 = new Persona ();
		p1.setNombre("Adrian");
		String nombreEsperado = "Adrian";
		String nombre = p1.getNombre();
		assertEquals(nombreEsperado,nombre);
	}

	@Test
	void testGetApellido1() {
		Persona p1 = new Persona ("12345678A", "Adrian", "Sorroche");
		String ape = p1.getApellido1();
		String apeEsperado = "Sorroche";
		
		assertEquals(apeEsperado,ape);
	}

	@Test
	void testSetApellido1() {
		Persona p1 = new Persona ();
		p1.setApellido1("Sorroche");
		String apeEsperado = "Sorroche";
		String ape = p1.getApellido1();
		assertEquals(apeEsperado,ape);
	}

}
