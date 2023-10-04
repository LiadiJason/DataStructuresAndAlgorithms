package data_structures.hashtables;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author LiadiJason
 * @version $Id: FirstRecurring.java, 2023-08-8:23 PM LiadiJason
 */
public class FirstRecurring {
    public Integer firstRecurringCharacter(List<Integer> integerList) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < integerList.size(); i++) {
            if (integerMap.containsKey(integerList.get(i))) {
                return integerList.get(i);
            }
            integerMap.put(integerList.get(i), null);
        }
        return null;
    }
}
