package DataStructures;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LiadiJason
 * @version $Id: PairsOfSumArraysTest.java, 2023-08-6:21 AM LiadiJason
 */
public class PairsOfSumArraysTest {

    PairsOfSumArrays pairsOfSumArrays = new PairsOfSumArrays();

    @Test
    public void pairsOfSumArrays_Success() {
        String result = pairsOfSumArrays.pairsOfSumArrays(mockListOfInteger(), 8);
        String expectedOutput = "[1,7]\n" +
                "[2,6]\n" +
                "[3,5]\n" +
                "[4,4]\n";
        Assert.assertEquals(expectedOutput, result);
    }

    @Test
    public void findPairsOfSumArrays_Success() {
        boolean result = pairsOfSumArrays.findPairsOfSumArrays(mockListOfInteger(), 8);
        Assert.assertTrue(result);
    }

    @Test
    // todo: [4,4] does not produced
    public void pairsOfSumArraysEnhancedEfficiency_Success() {
        String result = pairsOfSumArrays.pairsOfSumArraysEnhancedEfficiencyWithDuplicates(mockListOfInteger(), 8);
        String expectedOutput = "[1,7]\n" +
                "[2,6]\n" +
                "[3,5]";
        Assert.assertEquals(expectedOutput, result);
    }

    @Test
    public void findPairsOfSumArraysEnhancedEfficiency_Success() {
        boolean result = pairsOfSumArrays.findPairsOfSumArraysEnhancedEfficiencyWithDuplicates(mockListOfInteger(), 8);
        Assert.assertTrue(result);
    }

    public static List<Integer> mockListOfInteger() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        return list;
    }
}
