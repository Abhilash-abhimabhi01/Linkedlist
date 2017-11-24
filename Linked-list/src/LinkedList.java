class LinkedList {
 
    static Node head;
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
 
    /* method to remove duplicates from a linked list */
    void duplicates() {
        Node a = null, b = null, dup = null;
        a = head;
 
        /* select elements one by one */
        while (a != null && a.next != null) {
            b = a;
 
            /* Compare the selected element with other elements */
            while (b.next != null) {
 
                /* delete the duplicates */
                if (a.data == b.next.data) {
                    dup = b.next;
                    b.next = b.next.next;
                    System.gc();
                } else  {
                    b = b.next;
                }
            }
            a = a.next;
        }
    }
 
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
     public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(22);
        list.head.next.next = new Node(21);
        list.head.next.next.next = new Node(19);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(22);
        list.head.next.next.next.next.next.next = new Node(19);
 
        System.out.println("Linked List before removing duplicates : \n ");
        list.printList(head);
        list.duplicates();
        System.out.println("");
        System.out.println("Linked List after removing duplicates : \n ");
        list.printList(head);
    }
}