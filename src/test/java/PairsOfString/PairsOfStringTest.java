package PairsOfString;


import org.junit.Test;

import static PairsOfString.PairsOfString.array;
import static org.testng.Assert.assertEquals;


/**
 * @author LiadiJason
 * @version $Id: PairsOfString.PairsOfStringTest.java, 2023-08-7:35 PM LiadiJason
 */
public class PairsOfStringTest {

    private final PairsOfString pairsOfString = new PairsOfString();

    @Test
    public void pairsOfStringInArrayDuplicateAllowed_Success() {
        String result = PairsOfString.pairsOfStringInArrayDuplicateAllowed(array);

        String expectedOutput = "[A,A]\n" +
                "[A,B]\n" +
                "[A,C]\n" +
                "[B,A]\n" +
                "[B,B]\n" +
                "[B,C]\n" +
                "[C,A]\n" +
                "[C,B]\n" +
                "[C,C]\n";
        assertEquals(expectedOutput, result);
    }

    @Test
    public void pairsOfStringInArrayEnhancedFor_Success() {
        String result = PairsOfString.pairsOfStringInArrayEnhancedFor(array);

        String expectedOutput = "[A,A]\n" +
                "[A,B]\n" +
                "[A,C]\n" +
                "[B,A]\n" +
                "[B,B]\n" +
                "[B,C]\n" +
                "[C,A]\n" +
                "[C,B]\n" +
                "[C,C]\n";
        assertEquals(expectedOutput, result);
    }

    @Test
    public void pairsOfStringInArrayDuplicateNotAllowed_Success() {
        String result = PairsOfString.pairsOfStringInArrayDuplicateNotAllowed(array);

        String expectedOutput = "[A,B]\n" +
                "[A,C]\n" +
                "[B,A]\n" +
                "[B,C]\n" +
                "[C,A]\n" +
                "[C,B]\n";
        assertEquals(expectedOutput, result);
    }

    @Test
    public void pairsOfStringInArrayDuplicateNotAllowedAndReverseNotAllowed_Success() {
        String result = PairsOfString.pairsOfStringInArrayDuplicateNotAllowedAndReverseNotAllowed(array);

        String expectedOutput = "[A,B]\n" +
                "[A,C]\n" +
                "[B,C]\n";
        assertEquals(expectedOutput, result);
    }
}
