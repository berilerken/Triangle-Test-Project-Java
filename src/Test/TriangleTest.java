import org.junit.Test;

import static junit.framework.TestCase.*;
import static org.junit.Assert.assertNotEquals;

//201928015 Beril ERKEN

public class TriangleTest {

    @Test
    public void Test1() {
        final String type = Triangle.TriangleType(3, 3, 3);
        assertEquals("equilateral", type);
        System.out.println("Triangle: " +type +"\nBasis path is: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 21");

    }

    @Test
    public void Test2() {
        final String type = Triangle.TriangleType(3, 3, 4);
        assertNotEquals("equilateral", type);
        System.out.println("Triangle: " +type +"\nBasis path is: 1, 2, 3, 4, 5, 6, 8, 10, 11, 16, 22");
        //assertEquals("isosceles", type);

    }

    @Test
    public void test3() {
        final String type = Triangle.TriangleType(1, 4, 2);
        //assertNotEquals("equilateral", type);
        assertFalse(type=="equilateral");
        System.out.println("Triangle: " +type +"\nBasis path is: 1, 2, 3, 4, 6, 8, 10, 17, 18, 19, 20, 23");

    }

    @Test
    public void test4() {
        final String type = Triangle.TriangleType(4, 1, 2);
        assertEquals("not a triangle", type);
        System.out.println("Triangle: " +type +"\nBasis path is: 1, 2, 3, 4, 6, 8, 10, 17, 18, 19, 23");
    }

    @Test
    public void test5() {
        final String type = Triangle.TriangleType(1, -1, 1);
        //assertEquals("not a triangle", type);
        assertTrue(type=="not a triangle");
        System.out.println("Triangle: " +type +"\nBasis path is: 1, 2, 3, 4, 6, 7, 8, 10, 11, 12, 15, 23");

    }


}