package algorithms.beginnersLevelTest;

import algorithms.beginnersLevel.SumOfIntegers;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfIntegersTest {

    SumOfIntegers sum;

    @Before
    public void setUp(){
        sum = new SumOfIntegers();
    }

    @Test
    public void returnZeroIfIntegerIsZeroTest(){
        int value = 0;
        assertEquals(0,sum.sumOfIntegers(value));
    }

    @Test
    public void returnSumIfIntegerIsGreaterThanZeroTest(){
        int value = 148;
        assertEquals(13,sum.sumOfIntegers(value));
    }

    @Test
    public void returnSumIfIntegerIsLessThanZeroTest(){
        int value = -148;
        assertEquals(-13,sum.sumOfIntegers(value));
    }

}