/**
 * 
 */
package me.sumartha.test;

import static org.junit.Assert.*;
import me.sumartha.factorial.Factorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author wahyusumartha
 *
 */
public class FactorialTest {

	private static final double DELTA = 1e-15;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void zeroFactorialIsOne() {
		Factorial factorial = new Factorial();
		float result = factorial.getFactorialOf(0);
		assertEquals(1, result, DELTA);
	}
	
	@Test
	public void oneFactorialIsOne() {
		Factorial factorial = new Factorial(); 
		float result = factorial.getFactorialOf(1);
		assertEquals(1, result, DELTA);
	}
	
	@Test
	public void twoFactorialIsOne() {
		Factorial factorial = new Factorial();
		float result = factorial.getFactorialOf(2);
		assertEquals(1, result, DELTA);
	}
}
