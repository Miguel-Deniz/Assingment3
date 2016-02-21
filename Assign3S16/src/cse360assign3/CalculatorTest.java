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
		calc.subtract(0);
		assertEquals(0, calc.getTotal());
		calc.multiply(0);
		assertEquals(0, calc.getTotal());
		calc.divide(0);
		assertEquals(0, calc.getTotal());

		calc.add(10);
		calc.subtract(5);
		calc.multiply(2);
		calc.divide(2);
		assertEquals(5, calc.getTotal());
	}

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal());
		
		calc.add(0);
		assertEquals(0, calc.getTotal());
		
		calc.add(3);
		calc.add(5);
		calc.add(10);
		assertEquals(18, calc.getTotal());
		
		calc.add(-4);
		calc.add(-7);
		assertEquals(7, calc.getTotal());
	}

	@Test
	public void testSubtract() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal());
		
		calc.subtract(0);
		assertEquals(0, calc.getTotal());
		
		calc.subtract(1);
		calc.subtract(6);
		calc.subtract(5);
		assertEquals(-12, calc.getTotal());
		
		calc.subtract(-10);
		calc.subtract(-2);
		assertEquals(0, calc.getTotal());
	}

	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal());
		
		calc.add(1);
		assertEquals(1, calc.getTotal());
		
		calc.multiply(2);
		calc.multiply(3);
		calc.multiply(4);
		assertEquals(24, calc.getTotal());
		
		calc.multiply(-1);
		assertEquals(-24, calc.getTotal());
		
		calc.multiply(-2);
		assertEquals(48, calc.getTotal());
		
		calc.multiply(0);
		assertEquals(0, calc.getTotal());
	}

	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal());
		
		calc.add(200);
		assertEquals(200, calc.getTotal());
		
		calc.divide(2);
		calc.divide(25);
		assertEquals(4, calc.getTotal());
		
		calc.divide(-1);
		assertEquals(-4, calc.getTotal());
		
		calc.divide(0);
		assertEquals(0, calc.getTotal());
	}

	@Test
	public void testGetHistory() {
		fail("Not yet implemented");
	}

}
