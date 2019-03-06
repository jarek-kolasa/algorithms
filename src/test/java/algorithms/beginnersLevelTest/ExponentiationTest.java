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
        assertEquals(1,exponentiation.toThePower(value, power), 0.01);
    }

    @Test
    public void returnFourIfTwoToSecondPower(){
        int power = 2;
        int value = 2;
        assertEquals(4,exponentiation.toThePower(value, power), 0.01);
    }

    @Test
    public void returnFourIfMinusTwoToSecondPower(){
        int power = 2;
        int value = -2;
        assertEquals(4,exponentiation.toThePower(value, power), 0.01);
    }

    @Test
    public void return27IfThreeToThirdPower(){
        int power = 3;
        int value = 3;
        assertEquals(27,exponentiation.toThePower(value, power), 0.01);
    }

    @Test
    public void returnMinus27IfMinusThreeToThreePower(){
        int power = 3;
        int value = -3;
        assertEquals(-27,exponentiation.toThePower(value, power), 0.01);
    }

    @Test
    public void return025IfTwoToMinusTwoower(){
        int power = -2;
        int value = 2;
        assertEquals(0.25,exponentiation.toThePower(value, power), 0.01);
    }

    @Test
    public void return0037IfThreeToMinusThreePower(){
        int power = -3;
        int value = 3;
        assertEquals(0.037,exponentiation.toThePower(value, power), 0.001);
    }

}