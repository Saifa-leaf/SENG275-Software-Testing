import org.junit.Test;
import org.junit.Assert;

import static junit.framework.TestCase.assertFalse;

public class leapyeartest {
    leapyear L = new leapyear();

    @Test
    public void notDivisibleBy4() {
        boolean leap = L.leapYearCal(1441);
        assertFalse(leap);
    }


}
