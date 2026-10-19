package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSuma() {
		asserEquals(5, calculadora.suma(3,2));
	}

	@Test
	void testResta() {
		asserEquals(5, calculadora.resta(7,2));
	}
	
	@Test
	void testMultiplicacion() {
		asserEquals(6, calculadora.multiplicacion(3,2));
	}
	
	@Test
	void testDivision() {
		asserEquals(2, calculadora.division(4,2));
	}
	
}
