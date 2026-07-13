package concept.dsa;

import java.util.HashSet;
import java.util.Set;

class Node{
   int val;
   Node next;
   public Node(int data){
       this.val=data;
       next=null;
   }
}
public class RemoveDupUnsortedLinkedList {

    public static Node removeDuplicate(Node head){
        Set<Integer> set= new HashSet<>();
        Node currNode=head;
        Node prev=head;
        while (currNode!=null){
            if(set.add(currNode.val)) {
                prev=currNode;
                continue;
            }
            else {
                prev.next=currNode.next;
            }
            currNode=currNode.next;
        }
       return head;
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String []args){
        Node head = new Node(21);
        head.next = new Node(21);
        head.next.next = new Node(21);
        head.next.next.next = new Node(21);
        head.next.next.next.next = new Node(21);
        head.next.next.next.next.next = new Node(21);
        head.next.next.next.next.next.next = new Node(21);


        head= removeDuplicate(head);
        printList(head);
    }
}
