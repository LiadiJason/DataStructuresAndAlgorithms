package PairsOfString;

/**
 * @author LiadiJason
 * @version $Id: PairsOfString.PairsOfString.java, 2023-08-7:34 PM LiadiJason
 */
public class PairsOfString {

    public static final String[] array = {"A", "B", "C"};

    /**
     * Print all strings in array with duplicate allowed
     * */
    public static void pairsOfStringInArrayDuplicateAllowed(String[] array) {
        System.out.println("Pairs of String:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println("[" + array[i] + "," + array[j] + "]");
            }
        }
    }

    /**
     * Print all strings in array with duplicate allowed with enhanced for
     * */
    public static void pairsOfStringInArrayEnhancedFor(String[] array) {
        System.out.println("Pairs of String:");
        for (String i : array) {
            for (String j : array) {
                System.out.println("[" + i + "," + j + "]");

            }
        }
    }

    /**
     * Print all strings in array with duplicate not allowed
     * */
    public static void pairsOfStringInArrayDuplicateNotAllowed(String[] array) {
        System.out.println("Pairs of String:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (!array[i].equals(array[j])) {
                    System.out.println("[" + array[i] + "," + array[j] + "]");
                }
            }
        }
    }

    /**
     * Print all strings in array with duplicate not allowed and reverse not allowed
     * */
    public static void pairsOfStringInArrayDuplicateNotAllowedAndReverseNotAllowed(String[] array) {
        System.out.println("Pairs of String:");
        for (String s : array) {
            for (String value : array) {
                if (!s.equals(value) && s.compareTo(value) <= 0) {
                    System.out.println("[" + s + "," + value + "]");
                }
            }
        }
    }

    public static void main(String[] args) {
        pairsOfStringInArrayDuplicateNotAllowedAndReverseNotAllowed(array);
    }
}
