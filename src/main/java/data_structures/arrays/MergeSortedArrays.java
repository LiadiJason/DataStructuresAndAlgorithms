package data_structures.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LiadiJason
 * @version $Id: MergeSortedArrays.java, 2023-08-10:50 AM LiadiJason
 */
public class MergeSortedArrays {
    public List<Integer> mergeSortedArrays_WhileLoop(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> result = new ArrayList<>();

        int i = 0, j = 0;

        while (i < firstList.size() && j < secondList.size()){
            if (firstList.get(i) < secondList.get(j)) {
                result.add(firstList.get(i));
                i++;
            } else {
                result.add(secondList.get(j));
                j++;
            }
        }

        /*
         some or one of the elements of one of the arrays will
         be remaining to be put into the merged array,
         because those elements would be greater than the elements of
         the other array.
         */

        // adding remaining elements of arr1 into mergedArray, if any.
        while (i < firstList.size()) {
            result.add(firstList.get(i));
            i++;
        }
        // adding remaining elements of arr2 into mergedArray, if any.
        while (j < secondList.size()) {
            result.add(secondList.get(j));
            j++;
        }

        return result;
    }

    public List<Integer> mergeSortedArrays_ForLoop(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> result = new ArrayList<>();

        int i = 0, j = 0;

        for (; i < firstList.size() && j < secondList.size();) {
            if (firstList.get(i) < secondList.get(j)) {
                result.add(firstList.get(i));
                i++;
            } else {
                result.add(secondList.get(j));
                j++;
            }
        }

        for (; i < firstList.size(); i++) {
            result.add(firstList.get(i));
        }

        for (; j < secondList.size(); j++) {
            result.add(secondList.get(j));
        }

        return result;
    }
}
