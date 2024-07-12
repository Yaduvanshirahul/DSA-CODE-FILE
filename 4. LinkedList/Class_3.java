/* When we have given information about only head and findout the next all data  */

public class Class_3 {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    /* Displaying value of LinkedList using display() */
    public static void display(Node head) {
        while (head != null) {
            System.out.println(head.data + "  ");
            head = head.next;
        }
    }

    /* Displaying value of LinkedList recursively */

    public static void displayr(Node head) {
        if (head == null)
            return; // these return means just over the displayr() when head value is null
        System.out.println(head.data);
        displayr(head.next);
        System.out.println(head.data); /*
                                        * it will print value recursively becz call value is store in the form of stack
                                        * and value print in LIFO manner
                                        */

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

        Node temp = a; /*
                        * here not a new node created just a variable temp created which also point the
                        * node of a which always preserved the value of (a) as head
                        */
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

        /*
         * while (temp != null) {
         * System.out.println(temp.data + " ");
         * temp = temp.next;
         * }
         * while we again want to one more while loop then it could not run becz (a)
         * which is head node has lost it so that's why we create function display()
         * to print data
         */

        System.out.println("Using display()");
        display(a);

        /*
         * Using while again can't print value one more time but using display once more
         * it will print becz (a) is preserved
         */
        System.out.println();
        display(a); /* by using display() our (a) is preserved */

        System.out.println("Displaying value Recursively");
        displayr(a);
    }
}
