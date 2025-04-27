import javax.swing.plaf.nimbus.NimbusStyle;
import java.util.HashMap;
import java.util.Map;

public class LengthOfLoop {

    public static int brute(Node head){
        if (head == null || head.next == null)
            return 0;

        Map<Node, Integer> map = new HashMap<>();
        Node temp = head;
        int count = 1;
        while (temp != null){
            if (map.containsKey(temp)){
                return count - map.get(temp);
            }

            map.put(temp, count++);
            temp = temp.next;
        }
        return 0;
    }

    public static int useTortoiseAndHare(Node head){
        if (head == null || head.next == null)
            return 0;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                return findLength(slow, fast);
            }
        }
        return 0;
    }

    private static int findLength(Node start, Node end){
        int count = 1;
        end = end.next;
        while (start != end){
            count++;
            end = end.next;
        }
        return count;
    }
}
