
public class InsertAndDeleteLinkedList {

    static void insertLinkedList(int data, int position, Node head) {
        Node temp=new Node(data);
        if(position==0){
           temp.next=head;
           head=temp;
       }
        Node curr=head;
        for (int i=0;i<position-1;i++){
            curr=curr.next;
        }
        temp.next=curr.next;
        curr.next=temp;
        head=curr;
    }
    static void deleteLinkedList(int data, int position, Node head) {
        Node curr=head;
        for (int i=0;i<position-1;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        head=curr;
    }

    static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        System.out.println("Before Insertion:");
        printList(head);
//        System.out.println("After Insertion:");
//        insertLinkedList(100, 3, head);
        deleteLinkedList(40, 3, head);
        printList(head);
    }
}

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
