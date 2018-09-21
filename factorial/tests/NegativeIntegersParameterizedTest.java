
package factorial.tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import factorial.Factorial;
import factorial.exceptions.UnnaturalNumberException;
import factorial.tests.category.FactorialCategory;
import factorial.tests.category.FactorialParameterizedCategory;
import factorial.tests.category.InvalidEntriesCategory;

@RunWith(Parameterized.class)
@Category({FactorialCategory.class, InvalidEntriesCategory.class, FactorialParameterizedCategory.class})
public class NegativeIntegersParameterizedTest {

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{-2070553196, 1},
			{-2067161675, 1},
			{-1906283021, 1},
			{-1783709930, 1},
			{-1709502890, 1},
			{-1660568718, 1},
			{-1261977776, 1},
			{-1250573469, 1},
			{-1135183257, 1},
			{-1105673422, 1},
			{-1025753566, 1},
			{-937432503, 1},
			{-763402937, 1},
			{-708499800, 1},
			{-600963938, 1},
			{-576424165, 1},
			{-259749429, 1},
			{-182430157, 1},
			{-158150839, 1},
			{-144910521, 1}
		});
	}

	private int fInput;

	private long fExpected;

	public NegativeIntegersParameterizedTest(int input, long expected) {
		this.fInput = input;
		this.fExpected = expected;
	}
	
	@Test(expected = UnnaturalNumberException.class)
	public void testInvalidIntegerFactorial() {
		Factorial fac = new Factorial(this.fInput);
		assertEquals(this.fExpected, fac.result());
	}
}
