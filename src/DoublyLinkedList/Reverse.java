package DoublyLinkedList;

import javax.swing.plaf.IconUIResource;
import java.awt.geom.NoninvertibleTransformException;
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

    public static Node better(Node head){
        Node current = head;
        Node newNode = null;


        while (current != null) {
            Node pre = current.back;
            Node front = current.next;
            current.next = pre;
            current.back = front;

            newNode = current;

            current = front;

        }
        return newNode;
    }

    public static Node optimized(Node head){
        Node temp = head;
        Node last = null;
        while (temp != null){
            last = temp;

            Node prev = temp.back;
            temp.back = temp.next;
            temp.next = prev;
            temp = temp.back;
        }

        return last;
    }
}
