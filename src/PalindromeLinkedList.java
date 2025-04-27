import javax.net.ssl.HandshakeCompletedEvent;
import javax.swing.plaf.nimbus.NimbusStyle;
import java.util.Stack;

public class PalindromeLinkedList {

    public static boolean usingStack(Node head){
        if (head == null || head.next == null)
            return false;


        Stack<Integer> stack = new Stack<>();

        Node temp = head;
        while (temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while (temp != null){
            if (temp.data != stack.pop())
                return false;

            temp = temp.next;
        }
        return true;
    }

    public static boolean usingTortoiseAndHare(Node head){
        if (head == null && head.next != null){
            return true;
        }

        Node fast = head;
        Node slow = head;

        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node newHead = reverse(slow.next);
        Node second = newHead;
        fast = head;
        while (second != null){
            if (second.data != fast.data){
                reverse(newHead);
                return false;
            }
            second = second.next;
            fast = fast.next;
        }
        reverse(newHead);
        return true;

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
