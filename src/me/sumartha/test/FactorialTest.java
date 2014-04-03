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
		assertNotNull(factorial);
	}

}
