import java.util.ArrayList;
import java.util.List;

public class OddEvenLinkedList {

    public static Node brute(Node head){

        if (head == null || head.next == null)
            return null;

        List<Integer> list = new ArrayList<>();
        Node temp = head;
        while (temp != null && temp.next != null){
            list.add(temp.data);
            temp = temp.next.next;
        }
        if (temp != null)
            list.add(temp.data);

        temp = head.next;
        while (temp != null && temp.next != null){
            list.add(temp.data);
            temp = temp.next.next;
        }
        if (temp != null)
            list.add(temp.data);

        int i = 0;
        temp = head;
        while (temp != null){
            temp.data = list.get(i);
            i++;
            temp = temp.next;
        }

        return head;
    }

    public static Node optimal(Node head){
        if (head == null || head.next == null)
            return head;

        Node odd = head;
        Node even = head.next;
        Node evenHead = head.next;

        while (even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }
}
