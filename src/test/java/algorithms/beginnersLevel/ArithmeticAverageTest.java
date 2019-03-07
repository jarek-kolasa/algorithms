package algorithms.beginnersLevel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArithmeticAverageTest {

    ArithmeticAverage average;

    @Before
    public void setUp() {
        average = new ArithmeticAverage();
    }

    @Test
    public void returnZeroIfArrayIsEmptyTest(){
        int [] array = new int[] {};
        assertEquals(0.0, average.calculateArithmeticalAverage(array), 0.1);
    }

    @Test
    public void returnZeroIfArrayIsNullTest(){
        int [] array = new int[] {};
        assertEquals(0.0, average.calculateArithmeticalAverage(array), 0.1);
    }

    @Test
    public void returnTwoIfArrayHasOnlyTwoValuesTest(){
        int [] array = new int[] {2, 2, 2, 2, 2};
        assertEquals(2.0, average.calculateArithmeticalAverage(array), 0.1);
    }

    @Test
    public void returnMinusTwoIfArrayHasOnlyMinusTwoValuesTest(){
        int [] array = new int[] {-2, -2, -2, -2, -2};
        assertEquals(-2.0, average.calculateArithmeticalAverage(array), 0.1);
    }

    @Test
    public void returnCorrectValueIfArrayHasValuesTest(){
        int [] array = new int[] {2, 3, 4, 5, 6};
        assertEquals(4.0, average.calculateArithmeticalAverage(array), 0.1);
    }

    @Test
    public void returnIncorrectValueIfShouldReturnIncorrectValueTest(){
        int [] array = new int[] {2, 3, 4, 5, 6};
        assertNotEquals(2.0, average.calculateArithmeticalAverage(array), 0.1);
    }

    @Test
    public void returnTwoAndHalfValueIfArrayHasValuesTest(){
        int [] array = new int[] {2, 3, 2, 3, 2, 3};
        assertEquals(2.5, average.calculateArithmeticalAverage(array), 0.1);
    }
}