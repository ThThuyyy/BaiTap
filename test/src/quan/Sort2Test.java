package quan;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import nguyen.Sort2;

public class Sort2Test {

	@Test
	public void testSortDesc_Number1GreaterThanNumber2() {

		Sort2 sorter = new Sort2();
		sorter.setNumber1(10);
		sorter.setNumber2(5);

		sorter.sortDesc();

		assertTrue(sorter.getNumber1() >= sorter.getNumber2());
	}

	@Test
	public void testSortDesc_Number1LessThanNumber2() {

		Sort2 sorter = new Sort2();
		sorter.setNumber1(5);
		sorter.setNumber2(10);

		sorter.sortDesc();

		assertTrue(sorter.getNumber1() >= sorter.getNumber2());
	}

}