package algorithms.beginnersLevelTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import algorithms.beginnersLevel.AbsoluteValue;

public class AbsoluteValueTest {

	AbsoluteValue value;

	@Before
	public void setUp() {
		value = new AbsoluteValue();
	}

	@Test
	public void positiveValueTest() {
		int number = 4;
		assertEquals(4, value.checkNumber(number));
	}
	
	@Test
	public void negativeValueTest() {
		int number = -4;
		assertEquals(4, value.checkNumber(number));
	}
	
	@Test
	public void zeroValueTest() {
		int number = 0;
		assertEquals(0, value.checkNumber(number));
	}
}
