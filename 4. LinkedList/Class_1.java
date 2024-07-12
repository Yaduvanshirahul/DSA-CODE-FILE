/* Here we learned how to create a LinkedList */

public class Class_1 {

    // Creating Node

    // create a class of Node
    public static class Node {

        // Node is known as data which is user defined data which store data and address
        // of next data

        int data; // value
        Node next; // address of next node

    }

    public static void main(String args[]) {

        // creating object of Node class
        Node x = new Node();
        /*
         * System.out.println(x); when just int data declare then output is
         * Node@5acf9800
         */
        System.out.println(x.next); // when a Node create for address output is (null)
    }
}