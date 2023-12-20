import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class palindromeTest {

    @ParameterizedTest
    @CsvSource({
            "'anna', true",
            "'man', false",
            "'madam', true",
            "'loner', false"
    })
    void test(String h, boolean expected) {
        palindrome p=new palindrome();
        assertEquals(expected, p.palin(h));
    }
}
