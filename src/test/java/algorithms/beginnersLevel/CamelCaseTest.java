package algorithms.beginnersLevel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CamelCaseTest {

    CamelCase camelCase;

    @Before
    public void setUp() throws NullPointerException {
        camelCase = new CamelCase();
    }

    @Test
    public void returnNullIfTextIsNullTest() {
        String text = null;
        assertNull("", camelCase.textToChange(text));
    }

    @Test
    public void returnEmptyStringIfTextIsEmptyTest() {
        String text = "";
        assertEquals("", camelCase.textToChange(text));
    }

    @Test
    public void returnCamelCaseIfTextIsNotEmptyTest() {
        String text = "This is a text to change";
        assertEquals("ThIs iS A TeXt tO ChAnGe", camelCase.textToChange(text));
    }

    @Test
    public void returnCamelCaseIfTextIsNotEmptyAndTrimWhiteSpacesTest() {
        String text = "     This is a text to change      ";
        assertEquals("ThIs iS A TeXt tO ChAnGe", camelCase.textToChange(text));
    }
}