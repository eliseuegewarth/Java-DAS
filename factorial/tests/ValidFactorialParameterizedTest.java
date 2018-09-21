package factorial.tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import factorial.Factorial;

@RunWith(Parameterized.class)
public class ValidFactorialParameterizedTest {

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{0, 1L},
			{1, 1L},
			{2, 2L},
			{3, 6L},
			{4, 24L},
			{5, 120L},
			{6, 720L},
			{7, 5040L},
			{8, 40320L},
			{9, 362880L},
			{10, 3628800L},
			{11, 39916800L},
			{12, 479001600L},
			{13, 6227020800L},
			{14, 87178291200L},
			{15, 1307674368000L},
			{16, 20922789888000L},
			{17, 355687428096000L},
			{18, 6402373705728000L},
			{19, 121645100408832000L},
			{20, 2432902008176640000L}
		});
	}

	private int fInput;

	private long fExpected;

	public ValidFactorialParameterizedTest(int input, long expected) {
		this.fInput = input;
		this.fExpected = expected;
	}

	@Test
	public void testValidIntegerFactorial() {
		Factorial fac = new Factorial(this.fInput);
		assertEquals(this.fExpected, fac.result());
	}
}
