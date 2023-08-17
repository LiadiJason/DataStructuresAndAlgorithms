package DataStructures.ArraysExercise;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LiadiJason
 * @version $Id: MergeSortedArrays.java, 2023-08-10:50 AM LiadiJason
 */
public class MergeSortedArrays {
    public List<Integer> mergeSortedArrays(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> result = new ArrayList<>();

        int i = 0, j = 0, k = 0;

        for (;i < firstList.size() && j < secondList.size(); k++) {
            if (firstList.get(i) < secondList.get(j)) {
                result.add(firstList.get(i));
                i++;
            } else {
                result.add(secondList.get(j));
                j++;
            }
        }

        return result;
    }
}
