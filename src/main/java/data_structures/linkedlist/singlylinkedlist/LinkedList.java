package data_structures.linkedlist.singlylinkedlist;

import enums.ErrorCodeEnum;
import error_handler.ErrorBaseInfo;

/**
 * @author LiadiJason
 * @version $Id: LinkedListImplementation.java, 2023-08-9:30 PM LiadiJason
 */
public class LinkedList extends ErrorBaseInfo {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        head = new Node(value);
        tail = head;
        length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        length++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        length++;
    }

    public int[] printList() {
        int[] linkedList = new int[length];
        Node currentNode = this.head;
        int i = 0;
        while (currentNode != null) {
            linkedList[i] = currentNode.value;
            head = currentNode.next;
            i++;
        }
        return linkedList;
    }

    public void insert(int index, int value) {
        if (index < 0 && index < length) {
            super.setErrorCode(ErrorCodeEnum.INDEX_OUT_OF_BOUND.getErrorCode());
            super.setErrorMessage(ErrorCodeEnum.INDEX_OUT_OF_BOUND.getErrorMessage());
        } else if (index == 0) {
            append(value);
        } else if (index == length) {
            prepend(value);
        } else {
            Node currentNode = head;
            for (int i = 0; i < length - 1; i++) {
                currentNode = currentNode.next;
            }
            Node newNode = new Node(value);
            newNode.next = currentNode.next;
            currentNode.next = newNode;
            length++;
        }
    }

    public void remove(int index) {
        if (index < 0 && index < length) {
            super.setErrorCode(ErrorCodeEnum.INDEX_OUT_OF_BOUND.getErrorCode());
            super.setErrorMessage(ErrorCodeEnum.INDEX_OUT_OF_BOUND.getErrorMessage());
        } else if (index == 0) {
            head = this.head.next;
            length--;
        } else {
            Node currentNode = head;
            for (int i = 0; i < length - 1; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
            length--;
            if (index == length - 1) {
                tail = currentNode;
            }
        }
    }

}
