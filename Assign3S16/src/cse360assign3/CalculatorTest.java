package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator calc = new Calculator();
		assertNotNull(calc);
		assertEquals(0, calc.getTotal());
		assertEquals("", calc.getHistory());
	}

	@Test
	public void testGetTotal() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal());
		calc.add(0);
		assertEquals(0, calc.getTotal());
		calc.add(10);
		calc.add(5);
		calc.add(1);
		assertEquals(16, calc.getTotal());
		calc.add(-10);
		calc.add(-6);
		assertEquals(0, calc.getTotal());
	}

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal());
		calc.subtract(0);
		assertEquals(0, calc.getTotal());
		calc.subtract(-3);
		calc.subtract(-5);
		calc.subtract(-10);
		assertEquals(-18, calc.getTotal());
		calc.subtract(-4);
		calc.subtract(-7);
		assertEquals(-7, calc.getTotal());
	}

	@Test
	public void testSubtract() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetHistory() {
		fail("Not yet implemented");
	}

}
