package algorithms.beginnersLevelTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import algorithms.beginnersLevel.FindAnElementInArray;

public class FindAnElementInArrayTest {
	
	FindAnElementInArray findElement;
	
	@Before
	public void setUp() {
		findElement = new FindAnElementInArray();
	}
	
	@Test
	public void returnMinusOneIfValueNotExistTest() {
		
		int value = 7;
		int [] array = new int [] {1, 2, 3, 4, 5, 6, -2, -1, 0};
		
		assertEquals(-1, findElement.findTheElementInArray(value, array));
	}
	
	@Test
	public void returnMinusOneIfArrayIsNullTest() {
		
		int value = 7;
		int [] array = null;
		
		assertEquals(-1, findElement.findTheElementInArray(value, array));
	}
	
	@Test
	public void returnIndexIfValueDoesExistTest() {
		
		int value = -2;
		int [] array = new int [] {1, 2, 3, 4, 5, 6, -2, -1, 0};
		
		assertEquals(6, findElement.findTheElementInArray(value, array));
	}

}
