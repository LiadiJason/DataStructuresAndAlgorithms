package data_structures.linkedlist.doublylinkedlist;

/**
 * @author LiadiJason
 * @version $Id: Node.java, 2023-08-10:12 PM LiadiJason
 */
public class Node {
    int value;
    Node next;
    Node prev;

    public Node(int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}
