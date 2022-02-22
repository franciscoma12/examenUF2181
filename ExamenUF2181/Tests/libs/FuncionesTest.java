package libs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FuncionesTest {

	private static Funciones funciones;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		funciones= new Funciones();
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Iniciando tests...");
	}

	@Test
	void devuelveCentralTest() {
		assertEquals(5, funciones.devuelveCentral(1, 5, 9));
		assertEquals(22, funciones.devuelveCentral(39, 12, 22));
		//assertEquals(98, funciones.devuelveCentral(22, 38, 98));
	}
	
	@Test
	void esBisiestoTest() {
		assertFalse(funciones.esBisiesto(2023));
		assertTrue(funciones.esBisiesto(2020));
		assertTrue(funciones.esBisiesto(2024));


	}
	@Test
	void esCapicuaTest() {
		int v[]= {3,5,6,5,3};
		int v2[]= {1,9,9,8};
		assertTrue(funciones.esCapicua(v));
		assertFalse(funciones.esCapicua(v2));
	}
	@Test
	void suma_vectoresTest() {
		int v1[]= {1,2,3};
		int v2[]= {4,5,6};
		int v3[]= {7,8,9,0};
		int vres[]= {5,7,9};
		assertArrayEquals(vres, funciones.suma_vectores(v1, v2));
		assertThrows(ArithmeticException.class, ()-> funciones.suma_vectores(v1, v3));
	

		
	}
}
