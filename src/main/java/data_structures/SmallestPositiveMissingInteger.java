package data_structures;

import java.util.HashSet;

/**
 * @author LiadiJason
 * @version $Id: SmallestPositiveMissingInteger.java, 2023-09-8:09 PM LiadiJason
 */
public class SmallestPositiveMissingInteger {
    public static int findSmallestMissingPositive (int[] A) {
        int arrayLength = A.length;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arrayLength; i++) {
            if (A[i] > 0) {
                set.add(A[i]);
            }
        }

        for (int i = 1; i <= arrayLength + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return arrayLength + 1;
    }
}
