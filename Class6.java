/* INSERT AT BEGINNING METHOD */

public class Class6 {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        /* inserting elements at the end of linkedlist */
        void insertAtEnd(int val) {
            Node temp = new Node(val);

            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }

            tail = temp;
        }

        /* inserting element at the beginning/head of linkedlist */
        void insertAthead(int val) {
            Node temp = new Node(val);

            if (head == null) {
                head = temp;  /* when the head and tail both are empty */
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

    }

    public static void main(String[] args) {

        LinkedList li = new LinkedList();
        li.insertAtEnd(3);
        li.insertAtEnd(11);
        li.insertAtEnd(44);
        li.insertAthead(10);
        li.display();
    }
}
