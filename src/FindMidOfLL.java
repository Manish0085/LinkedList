import javax.swing.plaf.IconUIResource;

public class FindMidOfLL {


    public static Node brute(Node head){
        if (head == null || head.next == null)
            return head;

        int n = 0;
        Node temp = head;
        while (temp != null){
            n++;
            temp = temp.next;
        }
        int mid = (n/2) + 1;
        temp = head;
        n = 0;
        while (temp != null){
            n++;
            if (n == mid) break;
            temp = temp.next;
        }
        return temp;
    }

    public static Node tortoiseAndHare(Node head){
        if (head == null && head.next == null)
            return head;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
