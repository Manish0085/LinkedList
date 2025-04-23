package DoublyLinkedList;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 3, 5};

        Node head = ArrToDoublyLL.arrToDLL(arr);
        Traversing.traverseDLL(head);

        //Delete head from DLL
        //Traversing.traverseDLL(Deletion.deleteHead(head));

        //Delete tail from DLL
        //Traversing.traverseDLL(Deletion.deleteTail(head));

        //Delete kth node from DLL
        //Traversing.traverseDLL(Deletion.deleteKthNode(head, 4));

        //Delete given node from DLL
        Deletion.deleteGivenNodE(head.next.next );
        Traversing.traverseDLL(head);
    }
}
