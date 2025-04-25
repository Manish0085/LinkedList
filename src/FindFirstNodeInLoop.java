import java.util.HashMap;
import java.util.Map;

public class FindFirstNodeInLoop {

    public static Node brute(Node head){
        if (head == null || head.next == null){
            return null;
        }

        Node temp = head;
        Map<Node, Integer> map = new HashMap<>();
        while (temp != null){
            if (map.containsKey(temp))
                return temp;

            map.put(temp, map.getOrDefault(temp, 0)+1);
            temp = temp.next;
        }

        return null;
    }

    public static Node useTortoiseAndHare(Node head){
        if (head == null || head.next == null)
            return null;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                slow = head;
                while (slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return fast;
            }
        }
        return null;
    }
}
