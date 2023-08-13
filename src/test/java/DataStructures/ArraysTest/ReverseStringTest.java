package DataStructures.ArraysTest;

import DataStructures.ArraysExercise.ReverseString;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author LiadiJason
 * @version $Id: ReverseStringTest.java, 2023-08-8:05 PM LiadiJason
 */
public class ReverseStringTest {

    ReverseString reverseString = new ReverseString();

    @Test
    public void reverseString_Success() {
        String result = reverseString.reverseString(mockString());
        String expectedOutput = "!dlroW olleH";
        Assert.assertEquals(expectedOutput, result);
    }

    public static String mockString() {
        return "Hello World!";
    }
}
