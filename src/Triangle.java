import java.util.Scanner;
import org.junit.*;

//201928015 Beril ERKEN

public class Triangle {

    public static String TriangleType(final int a, final int b, final int c) {
        int match;
        String type;
        if ((a <= 0) || (b <= 0) || (c <= 0)) {
            type= "not a triangle";
            return type;
        }
        match = 0;
        if (a == b) {
            match = match + 1;
        }
        if (a == c) {
            match = match + 2;
        }
        if (b == c) {
            match = match + 3;
        }
        if (match == 0) {
            if (((a + b) < c) || ((a + c) < b) || ((b + c) < a)) {
                type= "not a triangle";
                return type;
            } else {
                type= "scalene";
                return type;
            }
        }
        if (match > 3) {
            type= "equilateral";
            return type;
        }
        if ((match == 1) && ((a + b) > c)) {
            type= "isosceles";
            return type;
        } else if ((match == 2) && ((a + c) > b)) {
            type= "isosceles";
            return type;
        } else if ((match == 3) && ((b + c) > a)) {
            type= "isosceles";
            return type; 
        }
        type= "not a triangle";
        return type;

    }
}
