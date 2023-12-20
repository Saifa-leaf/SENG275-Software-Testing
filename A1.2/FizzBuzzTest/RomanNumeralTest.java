import org.junit.Test;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class RomanNumeralTest {

    @Test
    public void testEmpty() {
        RomanNumeral rn = new RomanNumeral();
        String str = "";
        assertEquals(0,rn.convert(str));
    }

    @Test
    public void testBlank() {
        RomanNumeral rn = new RomanNumeral();
        String str = " ";
        assertEquals(0,rn.convert(str));
    }

    @Test
    public void testInvalidLetter() {
        RomanNumeral rn = new RomanNumeral();
        String str = "HeLlo";
        assertEquals(0,rn.convert(str));
    }

    @Test
    public void testInvalidOrder() {
        RomanNumeral rn = new RomanNumeral();
        String str = "IMDV";
        assertEquals(0,rn.convert(str));
    }

    @Test
    public void testValid() {
        RomanNumeral rn = new RomanNumeral();
        String str = "DDXII";
        assertEquals(1012,rn.convert(str));
    }
}
