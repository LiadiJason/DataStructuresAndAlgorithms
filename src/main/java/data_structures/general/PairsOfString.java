package data_structures.general;

import java.util.List;

/**
 * @author LiadiJason
 * @version $Id: DataStructures.General.PairsOfString.java, 2023-08-7:34 PM LiadiJason
 */
public class PairsOfString {

    /**
     * Print all strings in array with duplicate allowed
     * */
    public String pairsOfStringInArrayDuplicateAllowed(String[] array) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                result.append("[").append(array[i]).append(",").append(array[j]).append("]\n");
            }
        }
        return result.toString();
    }

    /**
     * Print all strings in array with duplicate allowed with List
     * */
    public String pairsOfStringInArrayDuplicateAllowedWithList(List<String> list) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                result.append("[").append(list.get(i)).append(",").append(list.get(j)).append("]\n");
            }
        }
        return result.toString();
    }

    /**
     * Print all strings in array with duplicate allowed with enhanced for
     */
    public String pairsOfStringInArrayEnhancedFor(String[] array) {
        StringBuilder result = new StringBuilder();
        for (String i : array) {
            for (String j : array) {
                result.append("[").append(i).append(",").append(j).append("]\n");
            }
        }
        return result.toString();
    }

    /**
     * Print all strings in array with duplicate allowed with enhanced for with list
     */
    public String pairsOfStringInArrayEnhancedForWithList(List<String> list) {
        StringBuilder result = new StringBuilder();
        for (String i : list) {
            for (String j : list) {
                result.append("[").append(i).append(",").append(j).append("]\n");
            }
        }
        return result.toString();
    }

    /**
     * Print all strings in array with duplicate not allowed
     */
    public String pairsOfStringInArrayDuplicateNotAllowed(String[] array) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (!array[i].equals(array[j])) {
                    result.append("[").append(array[i]).append(",").append(array[j]).append("]\n");
                }
            }
        }
        return result.toString();
    }

    /**
     * Print all strings in array with duplicate not allowed with list
     */
    public String pairsOfStringInArrayDuplicateNotAllowedWithList(List<String> list) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (!list.get(i).equals(list.get(j))) {
                    result.append("[").append(list.get(i)).append(",").append(list.get(j)).append("]\n");
                }
            }
        }
        return result.toString();
    }

    /**
     * Print all strings in array with duplicate not allowed and reverse not allowed
     */
    public String pairsOfStringInArrayDuplicateNotAllowedAndReverseNotAllowed(String[] array) {
        StringBuilder result = new StringBuilder();
        for (String i : array) {
            for (String j : array) {
                if (!i.equals(j) && i.compareTo(j) <= 0) {
                    result.append("[").append(i).append(",").append(j).append("]\n");
                }
            }
        }
        return result.toString();
    }

    /**
     * Print all strings in array with duplicate not allowed and reverse not allowed with List
     */
    public String pairsOfStringInArrayDuplicateNotAllowedAndReverseNotAllowedWithList(List<String> list) {
        StringBuilder result = new StringBuilder();
        for (String i : list) {
            for (String j : list) {
                if (!i.equals(j) && i.compareTo(j) <= 0) {
                    result.append("[").append(i).append(",").append(j).append("]\n");
                }
            }
        }
        return result.toString();
    }
}
