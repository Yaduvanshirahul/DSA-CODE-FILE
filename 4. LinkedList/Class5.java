/* Creating LinkedList using user defined object means class */

public class Class5 {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    /* Creating a user-defined linkedlist which is */
    public static class linkedlist {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {

            Node temp = new Node(val); /* creating a node of value temp where we pass a data ( val) */

            if (head == null) {
                head = temp; /* incase when we have not any node */
            } else {

                tail.next = temp; /*
                                   * point the tail next value to the created node temp head(a) -> b -> c(tail)
                                   * now c point to the temp and temp become tail
                                   */
            }

            tail = temp; /* these have to do always. now temp node become the tail node */
        }

        void display() {
            Node temp = head; /* to preserve the head */
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        linkedlist li = new linkedlist();
        li.insertAtEnd(23);
        li.insertAtEnd(11);
        li.display();
        System.out.println(li.size());
    }
}
