package factorial.tests;

import factorial.exceptions.UnnaturalNumberException;

import static org.junit.Assert.*;

import org.junit.Test;

import factorial.Factorial;

public class FactorialTest {

	@Test
	public void testValidIntegerFactorial() {
		Factorial fac = new Factorial(5);
		assertEquals(120, fac.result());
	}
	
	@Test(expected = UnnaturalNumberException.class)
	public void testInvalidIntegerFactorial() {
		Factorial fac = new Factorial(-1);
		assertEquals(1, fac.result());
	}
	
	@Test(expected = ArithmeticException.class)
	public void testArithmeticExceptionBigIntegerFactorial() {
		Factorial fac = new Factorial(20);
		// The expected value doesn't matter cause should catch the ArithmeticException.
		assertEquals(1, fac.result());
	}
	
	@Test
	public void testZeroFactorial() {
		Factorial fac = new Factorial(0);
		assertEquals(1, fac.result());
	}
	
	@Test
	public void testOneFactorial() {
		Factorial fac = new Factorial(1);
		assertEquals(1, fac.result());
	}
}
