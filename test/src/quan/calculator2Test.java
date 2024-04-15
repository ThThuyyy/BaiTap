package quan;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import nguyen.Calculator1;
import nguyen.calculator2;

class calculator2Test {
	calculator2 calculator = new calculator2();
		@Test
	    public void testSub_ResultValue() {
	        calculator.number1 = 5;
	        calculator.number2 = 3;
	        calculator.sub();
	        assertEquals(2, calculator.result);
	    }

	    @Test
	    public void testSub_LargerThanMaxInt() {
	        calculator.number1 = Integer.MAX_VALUE;
	        calculator.number2 = -1;
	        assertThrows(ArithmeticException.class, () -> {
	            calculator.sub();
	        });
	    }

	    @Test
	    public void testSub_SmallerThanMinInt() {
	        calculator.number1 = Integer.MIN_VALUE;
	        calculator.number2 = 1;
	        assertThrows(ArithmeticException.class, () -> {
	            calculator.sub();
	        });
	    }

		
	}


