package factorial.tests;

import factorial.exceptions.UnnaturalNumberException;
import factorial.tests.category.FactorialCategory;
import factorial.tests.category.InvalidEntriesCategory;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import factorial.Factorial;

@Category({FactorialCategory.class, InvalidEntriesCategory.class})
public class InvalidFactorialTest {
	
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
