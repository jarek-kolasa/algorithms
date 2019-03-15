package algorithms.beginnersLevel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DominantTest {

    Dominant dominant;

    @Before
    public void setUp(){
        dominant = new Dominant();
    }

    @Test
    public void returnZeroIfArrayIsNullTest(){
        int [] values = null;
        assertEquals(0, dominant.dominantValue(values));
    }

    @Test
    public void returnZeroIfArrayIsEmptyTest(){
        int [] values = {};
        assertEquals(0, dominant.dominantValue(values));
    }

    @Test
    public void returnTwoIfArrayHasOnlyValuesTwoTest(){
        int [] values = {2, 2, 2, 2, 2, 2};
        assertEquals(2, dominant.dominantValue(values));
    }

    @Test
    public void returnTwoTest(){
        int [] values = {2, 3, 2, 5, 6, 2};
        assertEquals(2, dominant.dominantValue(values));
    }
}