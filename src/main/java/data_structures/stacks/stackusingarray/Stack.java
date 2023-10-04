package data_structures.stacks.stackusingarray;

import java.util.ArrayList;

/**
 * @author LiadiJason
 * @version $Id: Stack.java, 2023-10-10:59 PM LiadiJason
 */
public class Stack {
    ArrayList<String> stackArray;

    public Stack() {
        this.stackArray = new ArrayList<>();
    }

    public String peek() {
        if (this.stackArray.size() > 0) {
            return stackArray.get(stackArray.size() - 1);
        } else {
            return null;
        }
    }

    public void push(String input) {
        this.stackArray.add(input);
    }

    public void pop() {
        this.stackArray.remove(stackArray.size() - 1);
    }

    public boolean isEmpty() {
        return stackArray.size() == 0;
    }
}
