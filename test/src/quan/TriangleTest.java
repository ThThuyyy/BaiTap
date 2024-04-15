package quan;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import nguyen.Triangle;


	public class TriangleTest {

		@Test
		public void testMaxLength_FirstNumberIsMax() {

			Triangle triangle = new Triangle(10, 5, 7);

			int result = triangle.maxLength();

			assertEquals(10, result);
		}

		@Test
		public void testMaxLength_SecondNumberIsMax() {

			Triangle triangle = new Triangle(5, 10, 7);

			int result = triangle.maxLength();

			assertEquals(10, result);
		}

		@Test
		public void testMaxLength_ThirdNumberIsMax() {

			Triangle triangle = new Triangle(5, 7, 10);

			int result = triangle.maxLength();

			assertEquals(10, result);
		}

	}
	
	

