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
		c1 = new Cuenta("12345","Titular1",50);
		c2 = new Cuenta("6789","Titular2" ,0);
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
	
	@Test
	void testIngresarCreaUnMovimiento() {
	    Cuenta cuenta = new Cuenta("12345", "Juan", 0.0);
	        
	    cuenta.ingresar(100.0);
	    
	    assertEquals(1, cuenta.getMovimientos().size(), "Debe haber 1 movimiento registrado");
	    
	    Movimiento mov = cuenta.getMovimientos().get(0);
	    assertEquals(100.0, mov.getImporte(), "El importe del movimiento debe ser 100.0");

	    assertEquals(Signo.H, mov.getSigno(), "El signo de un ingreso debe ser H"); 
	}
}
