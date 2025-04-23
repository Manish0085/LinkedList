package DoublyLinkedList;

import java.util.Stack;

public class Reverse {

    public static Node bruteForce(Node head){
        Node temp = head;
        Stack<Integer> stack = new Stack<>();
        while (temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while (temp != null){
            temp.data = stack.pop();
            temp = temp.next;
        }

        return head;
    }
}
