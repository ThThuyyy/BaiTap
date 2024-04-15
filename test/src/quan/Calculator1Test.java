package quan;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import nguyen.Calculator1;

class Calculator1Test {
	Calculator1 ca = new Calculator1();
	@Test
	public void Test1()
	{
		assertEquals(5,ca.add(2, 3));
	}
	@Test
	public void Test2()
	{
		assertEquals(3000000000.0,ca.add(2000000000, 1000000000));
	}
	@Test
	public void Test3()
	{
		assertEquals(-3000000000.0,ca.add(-2000000000, -1000000000));
	}


}
