
public class InsertAtBeginning {

    static Node insertBegin(Node head,int x){
        Node temp=new Node(x);
        temp.next=head;
        return temp;
    }

    static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Node head=null;
        head=insertBegin(head,30);
        head=insertBegin(head,20);
        head=insertBegin(head,10);
        printList(head);
    }


}

class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
