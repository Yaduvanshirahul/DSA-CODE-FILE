/* Here we create LinkedList and assign data and linked node */

public class Class_2 {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        // here we create 3 node in memory at random location in memory but till not all
        // link to each other
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(1);
        Node d = new Node(33);
        Node e = new Node(21);

        // 2->4->1->33->21 till now node are linked with each other

        a.next = b; // we link the address of (b) with node of (a)
        // 2->4 1 33 21
        System.out.println(a); // $Node@5acf9800 address of a
        System.out.println(a.next); // $Node@4617c264 address of b
        System.out.println(b); // $Node@4617c264 address of b
        System.out.println(c); // $Node@36baf30c address of c

        System.out.println(a.data); // value of a print 2
        System.out.println(a.next.data); // value of b print 4

        // now we linked all node
        b.next = c; // 2 -> 4 -> 1 33 -> 21
        c.next = d; // 2 -> 4 -> 1 -> 33 21
        d.next = e; // 2 -> 4 -> 1 -> 33 ->21 now finally LinkedList created

        // e.next = null; no need to define these bexz by default it points to null

        System.out.println(c.next.data);

        // System.out.println(e.next.data);

        // when we have given head and we have to print all value

        System.out.println("here we print value by using only head");
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
        System.out.println(a.next.next.next.next.data);

    }

}
