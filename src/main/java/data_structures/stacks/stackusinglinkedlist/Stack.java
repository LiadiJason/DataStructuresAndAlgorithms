package data_structures.stacks.stackusinglinkedlist;

/**
 * @author LiadiJason
 * @version $Id: Stack.java, 2023-10-10:37 PM LiadiJason
 */
public class Stack {

    private Node top;
    private Node bottom;
    private int length;

    public Stack() {
        top = null;
        bottom = null;
        length = 0;
    }

    public String peek() {
        if (length > 0) {
            return top.value;
        } else {
            return null;
        }
    }

    public void push(String input) {
        Node newNode = new Node(input);
        if (length == 0) {
            top = newNode;
            bottom = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        this.length++;
    }

    public void pop() {
        if (length > 0) {
            top = top.next;
            if (length == 1) {
                bottom = null;
            }
            length--;
        }
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public String getLastElement() {
        if (length > 0) {
            return bottom.value;
        }
        return null;
    }
}
