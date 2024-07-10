/* Here we learned how to create a LinkedList */

public class Class_1 {

    // Creating Node

    public static class Node {

        // Node is known as data which is user defined data

        int data; // value
        Node next; // address of next node

    }

    public static void main(String args[]) {

        Node x = new Node();
        /*
         * System.out.println(x); when just int data declare then output is
         * Node@5acf9800
         */
        System.out.println(x.next); // when a Node create for address output is (null)
    }
}