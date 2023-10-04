package data_structures.arrays;

/**
 * @author LiadiJason
 * @version $Id: ReverseString.java, 2023-08-7:54 PM LiadiJason
 */
public class ReverseString {

    public String reverseString(String inputString) {
        String temp = "";
        int inputStringLength = inputString.length();
        for (int i = inputString.length() - 1; i >= 0; i--) {
           temp += inputString.charAt(i);
        }
        return temp;
    }
}
