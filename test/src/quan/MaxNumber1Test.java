package quan;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import nguyen.MaxNumber1;
public class MaxNumber1Test {

	@Test
	public void testMax3_FirstNumberIsMax() {

		MaxNumber1 maxNumber = new MaxNumber1();
		maxNumber.number1 = 10;
		maxNumber.number2 = 5;
		maxNumber.number3 = 7;

		int result = maxNumber.max3();

		assertEquals(10, result);
	}

	@Test
	public void testMax3_SecondNumberIsMax() {

		MaxNumber1 maxNumber = new MaxNumber1();
		maxNumber.number1 = 5;
		maxNumber.number2 = 10;
		maxNumber.number3 = 7;

		int result = maxNumber.max3();

		assertEquals(10, result);
	}

	@Test
	public void testMax3_ThirdNumberIsMax() {

		MaxNumber1 maxNumber = new MaxNumber1();
		maxNumber.number1 = 5;
		maxNumber.number2 = 7;
		maxNumber.number3 = 10;

		int result = maxNumber.max3();

		assertEquals(10, result);
	}

}


   
	
		
	


