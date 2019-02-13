package algorithms.beginnersLevelTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import algorithms.beginnersLevel.SumOfAnArray;

public class SumOfAnArrayTest {
	
	SumOfAnArray sumOfAnArray;
	
	@Before
	public void setUp() {
		sumOfAnArray = new SumOfAnArray();
	}
	
	@Test
	public void sumOfPositiveValues() {
		int [] values = new int[] {1, 2, 3, 4, 5, 6};
		assertEquals(21, sumOfAnArray.checkSumOfAnArray(values));
	}

}
