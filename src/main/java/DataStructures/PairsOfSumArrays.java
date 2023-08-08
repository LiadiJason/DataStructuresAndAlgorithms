package DataStructures;

import java.util.*;

/**
 * @author LiadiJason
 * @version $Id: PairsOfSumArrays.java, 2023-08-6:12 AM LiadiJason
 */
public class PairsOfSumArrays {

    /**
     * Solution #1
     * Print pairs of int in array that adds of to sum input value with duplicate allowed
     * Time Complexity: O(n^2)
     * Space Complexity: O(n)
     */
    public String pairsOfSumArrays(List<Integer> list, int sumInput) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                int firstNumber = list.get(i);
                int secondNumber = list.get(j);
                int sumOfPairs = firstNumber + secondNumber;
                if (sumOfPairs == sumInput && firstNumber <= secondNumber) {
                    result.append("[").append(list.get(i)).append(",").append(list.get(j)).append("]\n");
                }
            }
        }
        return result.toString();
    }

    /**
     * Solution #1.1
     * Return true if found pairs of int in array that adds of to sum input value
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */
    public boolean findPairsOfSumArrays(List<Integer> list, int sumInput) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                int firstNumber = list.get(i);
                int secondNumber = list.get(j);
                int sumOfPairs = firstNumber + secondNumber;
                if (sumOfPairs == sumInput && firstNumber <= secondNumber) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Solution #2
     * Print pairs of int in array that adds of to sum input value with Map Approach
     * Time Complexity: O(n log n)
     * Space Complexity: O(n)
     */
    public String pairsOfSumArraysEnhancedEfficiencyWithDuplicates(List<Integer> list, int sumInput) {
        List<String> resultPairs = new ArrayList<>();
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : list) {
            int complement = sumInput - num;

            if (frequencyMap.containsKey(complement) && frequencyMap.get(complement) > 0) {
                resultPairs.add("[" + Math.min(num, complement) + "," + Math.max(num, complement) + "]");
                frequencyMap.put(complement, frequencyMap.get(complement) - 1);
            }

            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        Collections.sort(resultPairs);
        return String.join("\n", resultPairs);
    }

    /**
     * Solution #2.1
     * Return true if found pairs of int in array that adds of to sum input value with Set Approach
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public boolean findPairsOfSumArraysEnhancedEfficiencyWithDuplicates(List<Integer> list, int sumInput) {
        Set<Integer> set = new HashSet<>();
        for (int i : list) {
            if (set.contains(list.get(i))) {
                return true;
            }
            set.add(sumInput - list.get(i));
        }
        return false;
    }
}
