package LinkedList;

public class LinkedList {

    int length;
    Node head;
    Node tail;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    static class Node {

        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void getLength() {
        System.out.println("Length : " + length);
    }

    public void getHead() {
        System.out.println("Head : " + head.value);

    }

    public void getTail() {
        System.out.println("Tail : " + tail.value);
    }

    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = null;
            tail = null;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }
}


