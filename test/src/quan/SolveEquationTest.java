package quan;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import nguyen.SolveEquation;
public class SolveEquationTest {

	@Test
	public void testLinearEquation_MultiRoots() {
		SolveEquation equation = new SolveEquation(0, 0);

		String result = equation.linearEquation();

		assertEquals("Multi roots", result);
	}

	@Test
	public void testLinearEquation_NoRoot() {
		SolveEquation equation = new SolveEquation(0, 5);
		String result = equation.linearEquation();
		assertEquals("No root", result);
	}

	@Test
	public void testLinearEquation_OneRoot() {
		SolveEquation equation = new SolveEquation(5, 0);
		String result = equation.linearEquation();
		assertEquals("One root", result);
	}

}
