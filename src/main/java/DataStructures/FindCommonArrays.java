package DataStructures;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author LiadiJason
 * @version $Id: FindCommonArrays.java, 2023-08-10:01 PM LiadiJason
 */
public class FindCommonArrays {

    /**
     * Solution #1
     * Return true if there is same elements are present in two given list
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */
    public boolean findCommonArrays(List<String> firstList, List<String> secondList) {
        if (null != firstList && null != secondList) {
            for (int i = 0; i < firstList.size(); i++) {
                for (int j = 0; j < secondList.size(); j++) {
                    if (firstList.get(i).equals(secondList.get(j))) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    /**
     * Solution #2
     * Return true if there is same elements are present in two given list
     * Time Complexity: O(a + b)
     * Space Complexity: O(a)
     */
    public boolean findCommonArraysEnhancedEfficiency(List<String> firstList, List<String> secondList) {
        Set<String> stringSet = new HashSet<>(firstList);
        for (String s : secondList) {
            if (stringSet.contains(s)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Solution #3
     * Return true if there is same elements are present in two given list with Built-In Method
     * Time Complexity: O(a + b)
     * Space Complexity: O(a)
     */
    public boolean findCommonArraysEnhancedEfficiencyWithBuiltInMethod(List<String> firstList, List<String> secondList) {
        Set<String> stringSet = new HashSet<>(firstList);
        stringSet.retainAll(secondList);
        return !stringSet.isEmpty();
    }
}
