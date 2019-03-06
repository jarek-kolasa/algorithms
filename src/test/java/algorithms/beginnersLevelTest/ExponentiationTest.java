package algorithms.beginnersLevelTest;

import algorithms.beginnersLevel.Exponentiation;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExponentiationTest {

    Exponentiation exponentiation;

    @Before
    public void setUp(){
        exponentiation = new Exponentiation();
    }

    @Test
    public void returnOneIfZeroPower(){
        int power = 0;
        int value = 5;
        assertEquals(1,exponentiation.toThePower(value, power));
    }

    @Test
    public void returnFourIfTwoToSecondPower(){
        int power = 2;
        int value = 2;
        assertEquals(4,exponentiation.toThePower(value, power));
    }

}