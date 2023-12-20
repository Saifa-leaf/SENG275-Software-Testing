import org.junit.Test;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;

public class strLenTest {

    @ParameterizedTest
    @CsvSource({
            "'lemon', 5",
            "'matrix', 6",
            "'run', 3"
    })
    void test(String a, int expected) {
        strLen sl = new strLen();
        assertEquals(expected, sl.strLen(a));
    }
}
