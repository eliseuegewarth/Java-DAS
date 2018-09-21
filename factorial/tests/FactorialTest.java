package factorial.tests;

import factorial.exceptions.UnnaturalNumberException;

import static org.junit.Assert.*;

import org.junit.Test;

import factorial.Factorial;

public class FactorialTest {
	
	@Test(expected = UnnaturalNumberException.class)
	public void testInvalidIntegerFactorial() {
		Factorial fac = new Factorial(-1);
		assertEquals(1, fac.result());
	}
	
	@Test(expected = ArithmeticException.class)
	public void testArithmeticExceptionBigIntegerFactorial() {
		/*
		 * The Factorial of 21 give us a number 51090942171709440000 that is
		 * bigger than long type limit (9223372036854775807).
		 */
		Factorial fac = new Factorial(21);

		// The expected value doesn't matter cause should catch the ArithmeticException.
		assertEquals(1, fac.result());
	}
}
