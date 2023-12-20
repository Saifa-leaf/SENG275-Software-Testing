import org.junit.Test;
import org.junit.Assert.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TriangleTest {

    @ParameterizedTest
    @CsvSource({
        "1,1,2", "6,5,5"})
    public void testOffPoint1(int x, int y, int z){
        Triangle t = new Triangle();
        assertEquals("isosceles", t.categorise(x,y,z));
    }

    @ParameterizedTest
    @CsvSource({
            "4,5,6"})
    public void testOffPoint2(int x, int y, int z){
        Triangle t = new Triangle();
        assertEquals("scalene", t.categorise(x,y,z));
    }

    @ParameterizedTest
    @CsvSource({
            "0,1,1"})
    public void testOffPoint3(int x, int y, int z){
        Triangle t = new Triangle();
        assertEquals("invalid", t.categorise(x,y,z));
    }

    @ParameterizedTest
    @CsvSource({
            "1,1,1", "5,5,5"
    })
    public void testOnPoint(int x, int y, int z){
        Triangle t = new Triangle();
        assertEquals("equilateral", t.categorise(x,y,z));
    }

}
