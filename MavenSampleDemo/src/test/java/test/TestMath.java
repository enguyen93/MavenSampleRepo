package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.first.MathOperation;

public class TestMath {

	@Test
	public void testAdd() {
		MathOperation mo = new MathOperation();
		int actual = mo.add(5, 5);
		int expected = 10;
		assertEquals(expected, actual);

	}
	@Test
	public void testSubtract() {
		MathOperation mo = new MathOperation();
		int actual = mo.subtract(5, 5);
		int expected = 0;
		assertEquals(expected, actual);

	}
	@Test
	public void testProduct() {
		MathOperation mo = new MathOperation();
		int actual = mo.product(5, 5);
		int expected = 25;

		assertEquals(expected, actual);

	}

}
