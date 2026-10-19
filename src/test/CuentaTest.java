package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {
	
	Cuenta c;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		c = new Cuenta(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void IngresarTest() {
		c.ingresar(500);
		
		assertEquals(500, c.getSaldo());
	}
	
	@Test
	void RetirarTest() {
		c.retirar(500);
		
		assertEquals(-500, c.getSaldo());
	}

}
