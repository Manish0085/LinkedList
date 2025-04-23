package DoublyLinkedList;

public class Traversing {


    public static void traverseDLL(Node head){
        while (head != null){
            System.out.print(head.data+" -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
