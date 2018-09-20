package factorial.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import factorial.Factorial;

public class FactorialTest {

	@Test
	public void testValidIntegerFactorial() {
		Factorial fac = new Factorial(5);
		assertEquals(120, fac.result());
	}
	
	@Test
	public void testZeroFactorial() {
		Factorial fac = new Factorial(0);
		assertEquals(1, fac.result());
	}
}