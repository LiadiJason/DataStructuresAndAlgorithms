package PairsOfString;

import org.junit.Test;

import static org.testng.Assert.assertEquals;


/**
 * @author LiadiJason
 * @version $Id: PairsOfString.PairsOfStringTest.java, 2023-08-7:35 PM LiadiJason
 */
public class PairsOfStringTest {

    private final PairsOfString pairsOfString = new PairsOfString();

    @Test
    public void pairsOfStringInArrayDuplicateAllowed_Success() {
        String result = pairsOfString.pairsOfStringInArrayDuplicateAllowed(mockListOfString());

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
        String result = pairsOfString.pairsOfStringInArrayEnhancedFor(mockListOfString());

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
        String result = pairsOfString.pairsOfStringInArrayDuplicateNotAllowed(mockListOfString());

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
        String result = pairsOfString.pairsOfStringInArrayDuplicateNotAllowedAndReverseNotAllowed(mockListOfString());

        String expectedOutput = "[A,B]\n" +
                "[A,C]\n" +
                "[B,C]\n";
        assertEquals(expectedOutput, result);
    }

    public static String[] mockListOfString() {
        String[] alphabetArray = new String[3];
        alphabetArray[0] = "A";
        alphabetArray[1] = "B";
        alphabetArray[2] = "C";
        return alphabetArray;
    }
}
