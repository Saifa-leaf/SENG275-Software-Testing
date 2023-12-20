import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {
    FizzBuzz FB = new FizzBuzz();

    @Test
    public void notDividableByBoth() {
        int num = 1;
        assertEquals( "1!", FB.fizzBuzzFunction(num));
    }
    @Test
    public void dividableBy3() {
        int num = 6;
        assertEquals( "Fizz!", FB.fizzBuzzFunction(num));
    }

    @Test
    public void dividableBy5() {
        int num = 10;
        assertEquals( "Buzz!", FB.fizzBuzzFunction(num));
    }

    @Test
    public void dividableByBoth() {
        int num = 15;
        assertEquals( "FizzBuzz!", FB.fizzBuzzFunction(num));
    }
    
}
