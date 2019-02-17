package algorithms.beginnersLevelTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import algorithms.beginnersLevel.FindMinValueOfAnArray;

public class FindMinValueOfAnArrayTest {

	FindMinValueOfAnArray minValue;
	
	@Before
	public void setUp() {
		minValue = new FindMinValueOfAnArray();
	}
	
	@Test
	public void returnZeroIfArrayIsNullTest() {
		int [] arrayToCheck = null;
		
		assertEquals(0, minValue.minValueOfArray(arrayToCheck));
	}
	
	@Test
	public void returnZeroIfArrayIsEmptyTest() {
		int [] arrayToCheck = new int [] {};
		
		assertEquals(0, minValue.minValueOfArray(arrayToCheck));
	}
	
	@Test
	public void returnTwoTest() {
		int [] arrayToCheck = new int[] {4, 8, 2, 3, 9, 3};
		
		assertEquals(2, minValue.minValueOfArray(arrayToCheck));
	}
	
	@Test
	public void returnMinusTwoTest() {
		int [] arrayToCheck = new int[] {4, 8, 2, 3, 9, -2};
		
		assertEquals(-2, minValue.minValueOfArray(arrayToCheck));
	}
	
}
