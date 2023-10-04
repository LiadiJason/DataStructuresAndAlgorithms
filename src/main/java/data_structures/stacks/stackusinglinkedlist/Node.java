package data_structures.stacks.stackusinglinkedlist;

/**
 * @author LiadiJason
 * @version $Id: Node.java, 2023-10-10:32 PM LiadiJason
 */
public class Node {
    String value;
    Node next;

    public Node(String value) {
        this.value = value;
        this.next = null;
    }
}
