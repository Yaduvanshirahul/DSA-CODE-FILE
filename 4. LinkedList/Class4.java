/* Finding Length of LinkedList */

public class Class4 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static int Length(Node a) {
        int count = 0;
        while (a != null) {
            count++;
            a = a.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(23);
        Node c = new Node(21);

        a.next = b;
        b.next = c;

        System.out.println(Length(a));

    }
}
