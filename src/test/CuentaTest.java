package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sesion3.Cuenta;

class CuentaTest {
	
	Cuenta c1,c2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		c1 = new Cuenta("12345",50);
		c2 = new Cuenta("6789", 0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	/*@Test
	void IngresarTest() {
		c.ingresar(500.0);
		
		assertEquals(500.0, c.getSaldo());
	}
	
	@Test
	void RetirarTest() {
		c.retirar(500.0);
		
		assertEquals(-500.0, c.getSaldo());
	}*/
	
	@Test
	void Test0014() {
		c1.retirar(200.0);
		c2.retirar(350.0);
		c1.ingresar(100.0);
		c2.retirar(200.0);
		c2.retirar(150.0);
		c1.retirar(200.0);
		c2.ingresar(50.0);
		c2.retirar(100.0);
		
		assertEquals(-250.0,c1.getSaldo());
		assertEquals(-450.0, c2.getSaldo());
	}
}
