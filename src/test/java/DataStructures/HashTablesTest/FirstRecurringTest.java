package DataStructures.HashTablesTest;

import DataStructures.HashTables.FirstRecurring;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author LiadiJason
 * @version $Id: FirstRecurringTest.java, 2023-08-8:28 PM LiadiJason
 */
public class FirstRecurringTest {

    FirstRecurring firstRecurring = new FirstRecurring();

    @Test
    public void firstRecurring_Success() {
        Integer result = firstRecurring.firstRecurringCharacter(mockFirstList());
        Integer expectedOutput = 2;
        Assert.assertEquals(expectedOutput, result);
    }

    @Test
    public void firstRecurringSecondList_Success() {
        Integer result = firstRecurring.firstRecurringCharacter(mockSecondList());
        Integer expectedOutput = 1;
        Assert.assertEquals(expectedOutput, result);
    }

    @Test
    public void firstRecurringThirdList_Success() {
        Integer result = firstRecurring.firstRecurringCharacter(mockThirdList());
        Integer expectedOutput = null;
        Assert.assertEquals(expectedOutput, result);
    }

    public static List<Integer> mockFirstList() {
        return new ArrayList<>(Arrays.asList(2,5,1,2,3,5,1,2,4));
    }

    public static List<Integer> mockSecondList() {
        return new ArrayList<>(Arrays.asList(2,1,1,2,3,5,1,2,4));
    }

    public static List<Integer> mockThirdList() {
        return new ArrayList<>(Arrays.asList(2,3,4,5));
    }
}
