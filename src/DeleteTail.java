public class DeleteTail {

    public static Node deleteTail(Node head){
        if (head == null || head.next == null)
            return null;

        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;

        temp.next = null;
        return head;
    }
}
