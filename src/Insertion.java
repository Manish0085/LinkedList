import java.util.Scanner;

public class Insertion {


    public static Node InsertNodeAsFirstNode(Node head, int data){
        Node node = new Node(data, head);
//        Node temp = head;
//        head = node;
//        node.next = temp;
        return node;

    }

    public static Node insertTail(Node head, int data){
        if (head == null)
            return new Node(data);

        Node newNode = new Node(data);
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public static Node insertNodeAtKthPos(Node head, int data, int k){
        if (head == null){
            if (k == 1)
                return new Node(data);
            else {
                throw new IndexOutOfBoundsException("Position is out of bound");

            }
        }

        if (k == 1){
            return new Node(data, head);
        }
        int count = 0;
        Node temp = head;
        while (temp != null){
            count++;

            if(count == k-1){
                Node newNode = new Node(data);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }

            temp = temp.next;
        }
        return head;
    }


    public static Node insertNodeBeforeVal(Node head, int data, int val){
        if (head == null){
            return null;
        }

        if (head.data == val){
            return new Node(data, head);
        }
        Node temp = head;
        while (temp.next != null){

            if(temp.next.data == val){
                Node newNode = new Node(data);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }

            temp = temp.next;
        }
        return head;
    }

}
