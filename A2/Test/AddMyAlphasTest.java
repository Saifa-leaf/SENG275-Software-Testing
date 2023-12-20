import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AddMyAlphasTest {

    @ParameterizedTest
    @CsvSource({"0, ''", "1, '1'", "3, '1,2'", "25, '2,3,4,5,6,0,0,5'"})
    public void addTest(int expected, String num) {
        AddMyAlphas A = new AddMyAlphas();
        assertEquals(expected, A.add(num));
    }

    @Test
    public void addTestNewline() {
        AddMyAlphas A = new AddMyAlphas();
        int expected = 6;
        assertEquals(expected, A.add("1\n2,3"));
    }

    @Test
    public void addTestNeg1() {
        AddMyAlphas A = new AddMyAlphas();
        assertThrows(IllegalArgumentException.class, () -> {A.add("-1,2");});
    }

    @Test
    public void addTestNeg2() {
        AddMyAlphas A = new AddMyAlphas();
        assertThrows(IllegalArgumentException.class, () -> {A.add("2,-4,3,-5");});
    }

    @Test
    public void addTestLarge() {
        AddMyAlphas A = new AddMyAlphas();
        int expected = 2;
        assertEquals(expected, A.add("1001,2"));
    }

    @Test
    public void addTestDelimit() {
        AddMyAlphas A = new AddMyAlphas();
        int expected = 3;
        assertEquals(expected, A.add("//;\n1;2"));
    }
}
