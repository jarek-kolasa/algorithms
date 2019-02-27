package algorithms.beginnersLevelTest;


import algorithms.beginnersLevel.CountQuantityOfVariableInArray;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountQuantityOfVariableInArrayTest {

	CountQuantityOfVariableInArray quantity;

	@Before
	public void setUp() {
		quantity = new CountQuantityOfVariableInArray();
	}

	@Test
	public void returnOneIfVariableIsShownOneTimeInArrayTest() {
		int[] arrayToCheck = new int[] { 1, 2, 3, 4, -1, -2, -3 };
		int wantedValue = 3;

		assertEquals(1, quantity.countVariablesQuantity(arrayToCheck, wantedValue));
	}

	@Test
	public void returnZeroIfArrayIsEmptyTest() {
		int[] arrayToCheck = new int[] {};
		int wantedValue = 0;

		assertEquals(0, quantity.countVariablesQuantity(arrayToCheck, wantedValue));
	}

	@Test
	public void returnZeroIfArrayIsNullTest() {
		int[] arrayToCheck = null;
		int wantedValue = 0;

		assertEquals(0, quantity.countVariablesQuantity(arrayToCheck, wantedValue));
	}

	@Test
	public void returnZeroIfValueDoesNotExistInArrayTest() {
		int[] arrayToCheck = new int[] { 1, 2, 3, 4, -1, -2, -3 };
		int wantedValue = 5;

		assertEquals(0, quantity.countVariablesQuantity(arrayToCheck, wantedValue));
	}

}
