package DoublyLinkedList;

import javax.management.MBeanRegistration;

public class Deletion {

    public static Node deleteHead(Node head){
        if (head == null || head.next == null){
            return null;
        }

        Node pre = head;
        head = head.next;

        head.back = null;
        pre.next = null;

        return head;
    }

    public static Node deleteTail(Node head){
        if (head == null || head.next == null)
            return null;
        Node tail = head;
        while (tail.next != null){
            tail = tail.next;
        }

        Node pre = tail.back;
        pre.next = null;
        tail.back = null;

        return head;
    }

    public static Node deleteKthNode(Node head, int k){
        if (head == null)
            return null;

        int count = 0;
        Node kthNode = head;
        while (kthNode != null){
            count++;
            if (count == k)
                break;

            kthNode = kthNode.next;
        }

        Node pre = kthNode.back;
        Node front = kthNode.next;

        if (pre == null && front == null)
            return null;
        else if (pre == null){
            return deleteHead(head);
        }
        else if (front == null){
            return deleteTail(head);
        }

        pre.next = front;
        front.back = pre;
        kthNode.next = null;
        kthNode.back = null;
        return head;
    }

    public static void deleteGivenNodE(Node node){
        Node pre = node.back;
        Node front = node.next;

        if (front == null){
            pre.next = null;
            node.back = null;
            return ;
        }

        pre.next = front;
        front.back = pre;
        node.next = null;
        node.back = null;


    }
}
