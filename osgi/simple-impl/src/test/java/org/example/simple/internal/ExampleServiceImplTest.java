/**
 * 
 */
package org.example.simple.internal;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author eweitan
 *
 */
public class ExampleServiceImplTest {

	/**
	 * Test method for {@link org.example.simple.internal.ExampleServiceImpl#reverse(java.lang.String)}.
	 */
	@Test
	public void testScramble() {
		ExampleServiceImpl example = new ExampleServiceImpl();
		String input = "Hello The World!";
		String expect = "!dlroW ehT olleH";
		Assert.assertEquals(expect, example.reverse(input));
	}

}
