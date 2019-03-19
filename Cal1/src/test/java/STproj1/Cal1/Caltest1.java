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

}
