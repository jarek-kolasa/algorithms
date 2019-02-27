package algorithms.beginnersLevelTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import algorithms.beginnersLevel.BinarySearch;

public class BinarySearchTest {
	
	BinarySearch binary;
	
	@Before
	public void setUp() {
		binary = new BinarySearch();
	}

	@Test
	public void returnMinusOneIfArrayIsNullTest() {
		int [] array = null;
		int searchedValue = 5;
		assertEquals(-1, binary.findValue(searchedValue, array));
	}
	
	@Test
	public void returnMinusOneIfArrayIsEmptyTest() {
		int [] array = new int [] {};
		int searchedValue = 5;
		assertEquals(-1, binary.findValue(searchedValue, array));
	}
	
	@Test
	public void returnIndexIfValueExistsTest() {
		int [] array = new int [] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int searchedValue = 5;
		assertEquals(5, binary.findValue(searchedValue, array));
	}
}
