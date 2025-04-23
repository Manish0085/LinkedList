package DoublyLinkedList;

public class ArrToDoublyLL {

    public static Node arrToDLL(int[] arr){
        Node head = new Node(arr[0]);
        Node pre = head;

        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i], null, pre);
            pre.next = newNode;
            pre = newNode;
        }
        return head;
    }
}
