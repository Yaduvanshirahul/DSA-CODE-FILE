/* When we have given information about only head and findout the next all data  */

public class Class_3 {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(11);
        Node c = new Node(21);
        Node d = new Node(12);
        Node e = new Node(22);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node temp = a; // here not a new node created just a variable temp created which also point the
                       // node of a
        // for (int i = 0; i <= 5; i++) {
        // System.out.println(temp.data);
        // temp = temp.next;
        // }

        /*
         * the above code give these error
         * 2
         * 11
         * 21
         * 12
         * 22
         * Exception in thread "main" java.lang.NullPointerException: Cannot read field
         * "data" because "<local6>" is null
         * at Class_3.main(Class_3.java:30)
         */

        // so we used while loop for printing the list

        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}
