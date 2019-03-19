 package STproj1.Cal1;

import static org.junit.Assert.*;

import org.junit.BeforeClass;

import org.junit.Test;

public class Caltest1 {

	private static Cal1 calc;
	
	@BeforeClass
	public static void setup() {
		calc = new Cal1();
	}
	
	
	@Test
	public void testadd() {
		assertEquals(8,calc.add(3, 5));
	}
	@Test
	public void testsub() {
		assertEquals(5,calc.sub(7,2));
	}
	@Test
	public void testmul() {
		assertEquals(36,calc.mul(4,9));
	}
}
