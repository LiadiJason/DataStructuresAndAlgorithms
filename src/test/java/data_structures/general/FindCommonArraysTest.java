package data_structures.general;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * @author LiadiJason
 * @version $Id: FindCommonArraysTest.java, 2023-08-10:07 PM LiadiJason
 */
public class FindCommonArraysTest {

    FindCommonArrays findCommonArrays = new FindCommonArrays();

    @Test
    public void findCommonArrays_True() {
        boolean result = findCommonArrays.findCommonArrays(mockFirstListOfString(), mockSecondListOfString());
        assertTrue(result);
    }

    @Test
    public void findCommonArraysWithNull_False() {
        boolean result = findCommonArrays.findCommonArrays(mockFirstListOfString(), null);
        assertFalse(result);
    }

    @Test
    public void findCommonArraysEnhancedEfficiency_True() {
        boolean result = findCommonArrays.findCommonArraysEnhancedEfficiency(mockFirstListOfString(), mockSecondListOfString());
        assertTrue(result);
    }

    @Test
    public void findCommonArraysEnhancedEfficiencyWithBuiltInMethod_True() {
        boolean result = findCommonArrays.findCommonArraysEnhancedEfficiencyWithBuiltInMethod(mockFirstListOfString(), mockSecondListOfString());
        assertTrue(result);
    }

    @Test
    public void findCommonArraysWithEmptyList_False() {
        boolean result = findCommonArrays.findCommonArraysEnhancedEfficiencyWithBuiltInMethod(mockFirstListOfString(), mockEmptyList());
        assertFalse(result);
    }

    @Test
    public void findCommonArraysWithDoubleEmptyList_False() {
        boolean result = findCommonArrays.findCommonArraysEnhancedEfficiencyWithBuiltInMethod(mockEmptyList(), mockEmptyList());
        assertFalse(result);
    }

    @Test
    public void findCommonArrays_False() {
        boolean result = findCommonArrays.findCommonArrays(mockFirstListOfString(), mockThirdListOfString());
        assertFalse(result);
    }

    public static List<String> mockFirstListOfString() {
        List<String> alphabetList = new ArrayList<>();
        alphabetList.add("A");
        alphabetList.add("B");
        alphabetList.add("C");
        alphabetList.add("X");
        return alphabetList;
    }

    public static List<String> mockSecondListOfString() {
        List<String> alphabetList = new ArrayList<>();
        alphabetList.add("Z");
        alphabetList.add("Y");
        alphabetList.add("X");
        return alphabetList;
    }

    public static List<String> mockThirdListOfString() {
        List<String> alphabetList = new ArrayList<>();
        alphabetList.add("Z");
        alphabetList.add("Y");
        alphabetList.add("I");
        return alphabetList;
    }

    public static List<String> mockEmptyList() {
        return new ArrayList<>();
    }
}
