import java.util.HashSet;
import java.util.Set;

public class FindIntersection {

    public static Node usingSet(Node headA, Node headB){
        if (headA == null || headB == null)
            return null;

        Node temp1 = headA;
        Set<Node> set = new HashSet<>();
        while (temp1 != null){
            set.add(temp1);
            temp1 = temp1.next;
        }

        temp1 = headB;
        while (temp1 != null){
            if (set.contains(temp1))
                return temp1;

            temp1 = temp1.next;
            if (headA == null || headB == null){
                return null;
            }     }

        return null;
    }

    public static Node usingLength(Node headA, Node headB){


        Node t1 = headA;
        Node t2 = headB;
        int n1 = 0, n2 = 0;
        while (t1 != null){
            n1++;
            t1 = t1.next;
        }

        while (t2 != null){
            n2++;
            t2 = t2.next;
        }

        if (n1 > n2)
            return collisionPoint(headB, headA, n1-n2);
        else
            return collisionPoint(headA, headB, n2-n1);
    }

    private static Node collisionPoint(Node t1, Node t2, int d) {
        while (d > 0){
            t2 = t2.next;
        }

        while (t1 != t2){
            t1 = t1.next;
            t2 = t2.next;
        }

        return t1;
    }

    public static Node optimisedSolution(Node headA, Node headB){
        if (headA == null || headB == null){
            return null;
        }

        Node temp1 = headA;
        Node temp2 = headB;

        while (temp1 != temp2){

            temp1 = temp1.next;
            temp2 = temp2.next;

            if (temp1 == temp2)
                return temp1;

            if (temp1 == null)
                temp1 = headB;
            if (temp2 == null)
                temp2 = headA;
        }
        return temp1;
    }
}
