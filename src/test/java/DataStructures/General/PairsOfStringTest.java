package DataStructures.General;

import DataStructures.General.PairsOfString;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;


/**
 * @author LiadiJason
 * @version $Id: DataStructures.General.PairsOfStringTest.java, 2023-08-7:35 PM LiadiJason
 */
public class PairsOfStringTest {

    private final PairsOfString pairsOfString = new PairsOfString();

    @Test
    public void pairsOfStringInArrayDuplicateAllowed_Success() {
        String result = pairsOfString.pairsOfStringInArrayDuplicateAllowed(mockArrayOfString());

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
    public void pairsOfStringInArrayDuplicateAllowedWithList_Success() {
        String result = pairsOfString.pairsOfStringInArrayDuplicateAllowedWithList(mockListOfString());

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
        String result = pairsOfString.pairsOfStringInArrayEnhancedFor(mockArrayOfString());

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
    public void pairsOfStringInArrayEnhancedForWithList_Success() {
        String result = pairsOfString.pairsOfStringInArrayEnhancedForWithList(mockListOfString());

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
        String result = pairsOfString.pairsOfStringInArrayDuplicateNotAllowed(mockArrayOfString());

        String expectedOutput = "[A,B]\n" +
                "[A,C]\n" +
                "[B,A]\n" +
                "[B,C]\n" +
                "[C,A]\n" +
                "[C,B]\n";
        assertEquals(expectedOutput, result);
    }

    @Test
    public void pairsOfStringInArrayDuplicateNotAllowedWithList_Success() {
        String result = pairsOfString.pairsOfStringInArrayDuplicateNotAllowedWithList(mockListOfString());

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
        String result = pairsOfString.pairsOfStringInArrayDuplicateNotAllowedAndReverseNotAllowed(mockArrayOfString());

        String expectedOutput = "[A,B]\n" +
                "[A,C]\n" +
                "[B,C]\n";
        assertEquals(expectedOutput, result);
    }

    @Test
    public void pairsOfStringInArrayDuplicateNotAllowedAndReverseNotAllowedWithList_Success() {
        String result = pairsOfString.pairsOfStringInArrayDuplicateNotAllowedAndReverseNotAllowedWithList(mockListOfString());

        String expectedOutput = "[A,B]\n" +
                "[A,C]\n" +
                "[B,C]\n";
        assertEquals(expectedOutput, result);
    }

    public static String[] mockArrayOfString() {
        String[] alphabetArray = new String[3];
        alphabetArray[0] = "A";
        alphabetArray[1] = "B";
        alphabetArray[2] = "C";
        return alphabetArray;
    }

    public static List<String> mockListOfString() {
        List<String> alphabetList = new ArrayList<>();
        alphabetList.add("A");
        alphabetList.add("B");
        alphabetList.add("C");
        return alphabetList;
    }
}
