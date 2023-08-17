package DataStructures.ArraysTest;

import DataStructures.ArraysExercise.MergeSortedArrays;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author LiadiJason
 * @version $Id: MergeSortedArraysTest.java, 2023-08-10:56 AM LiadiJason
 */
public class MergeSortedArraysTest {

    MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();

    @Test
    public void reverseStringWithWhileLoop_Success() {
        List<Integer> result = mergeSortedArrays.mergeSortedArrays_WhileLoop(mockFirstList(), mockSecondList());
        List<Integer> expectedOutput = new ArrayList<>(Arrays.asList(0,3,4,4,6,30,31));
        Assert.assertEquals(expectedOutput, result);
    }

    @Test
    public void reverseStringWithForLoop_Success() {
        List<Integer> result = mergeSortedArrays.mergeSortedArrays_ForLoop(mockFirstList(), mockSecondList());
        List<Integer> expectedOutput = new ArrayList<>(Arrays.asList(0,3,4,4,6,30,31));
        Assert.assertEquals(expectedOutput, result);
    }

    public static List<Integer> mockFirstList() {
        return new ArrayList<>(Arrays.asList(0,3,4,31));
    }

    public static List<Integer> mockSecondList() {
        return new ArrayList<>(Arrays.asList(4,6,30));
    }
}
