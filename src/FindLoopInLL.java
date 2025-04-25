import java.util.HashMap;
import java.util.Map;

public class FindLoopInLL {


    public static boolean brute(Node head){
        Map<Node, Integer> map = new HashMap<>();
        Node temp = head;
        while (temp != null){
            if (map.containsKey(temp)){
                return true;
            }
            map.put(temp, map.getOrDefault(temp, 0)+1);
            temp = temp.next;
        }
        return false;
    }

    public static boolean usingTortoiseAndHare(Node head){
        if (head == null || head.next == null)
            return false;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }
}
