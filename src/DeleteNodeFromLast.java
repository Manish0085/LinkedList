import org.w3c.dom.NamedNodeMap;

public class DeleteNodeFromLast {


    public static Node brute(Node head, int n){
        Node temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        if (count == n){
            Node newHead = head.next;
            return newHead;
        }

        int res = count - n;
        temp = head;
        while (temp != null){
            res--;
            if (res == 0)
                break;
            temp = temp.next;
        }

        Node deleteNode = temp.next;
        temp.next = temp.next.next;
        return head;
    }


    public static Node optimised(Node head, int n){
        Node fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null){
            return head.next;
        }


        Node slow = head;
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        Node deleteNode = slow.next;
        slow.next = slow.next.next;
        return head;
    }

    public static Node better(Node head){
        Node temp = head;
        Node prev = null;
        while (temp != null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public static Node reverseUsingRecursion(Node head){
        return reverse(head);
    }

    private static Node reverse(Node head){
        if (head == null || head.next == null)
            return head;

        Node newHead = reverse(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newHead;

    }
}
