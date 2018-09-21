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
			{0, 1},
			{1, 1},
			{2, 2},
			{3, 6},
			{4, 24},
			{5, 120},
			{6, 720},
			{7, 5040},
			{8, 40320},
			{9, 362880},
			{10, 3628800},
			{11, 39916800},
			{12, 479001600}
		});
	}

	private int fInput;

	private int fExpected;

	public ValidFactorialParameterizedTest(int input, int expected) {
		this.fInput = input;
		this.fExpected = expected;
	}

	@Test
	public void testValidIntegerFactorial() {
		Factorial fac = new Factorial(this.fInput);
		assertEquals(this.fExpected, fac.result());
	}
}
