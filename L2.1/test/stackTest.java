import org.junit.*;
import org.junit.Test;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;

public class stackTest {

    @Beforetest
    public void setupBeforeEachTestCase()
    {
        stack<String> s = new stack<String>();
    }
    @Test
    public void testArraySizeIsZeroOnCreation() {
        int actual=0;
        int expected=s.size();
        assertEquals(expected,actual);
    }
    @Test
    public void testPushSingleItemOnTheStack()
    {
        s.push("a");
        int actual=1;
        int expected=s.size();
        assertEquals(expected,actual);
    }

    @Test
    public void testEmptyPop() {

    }

}
