package DoublyLinkedList;

public class Insertion {

    public static Node insertAsFirst(Node head, int val){
        Node newHead = new Node(val, head, null);
        head.back = newHead;
        return newHead;
    }

    public static Node insertBeforeTail(Node head, int val){
        if (head.next == null)
            return insertAsFirst(head, val);

        Node tail = head;
        while (tail.next != null){
            tail = tail.next;
        }

        Node pre = tail.back;
        Node newNode = new Node(val, tail, pre);

        pre.next = newNode;
        tail.back = newNode;
        return head;
    }

    public static Node insertAtKthPos(Node head, int k, int val){
        if (k == 1)
            return insertAsFirst(head, val);

        int count = 0;
        Node temp = head;
        while (temp != null){
            count++;
            if (count == k){
                break;
            }
            temp = temp.next;
        }

        Node pre = temp.back;
        Node newNode = new Node(val, temp, pre);
        pre.next = newNode;
        temp.back = newNode;
        return head;
    }

    public static void insertBeforeGivenNode(Node node, int val){
        Node pre = node.back;
        Node newNode = new Node(val, node, pre);
        node.back = newNode;
        pre.next = newNode;
    }

}
