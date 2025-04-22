public class DeleteFromLL {

    public static Node deleteFirst(Node head){

        if (head != null)
            return head;


        Node temp = head;
        head = head.next;
        return head;
    }

    public static Node deleteTail(Node head){
        if (head == null || head.next == null)
            return null;

        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;

        temp.next = null;
        return head;
    }

    public static Node delete(Node head, int k){
        if (head == null)
            return null;
        if (k == 1){
            Node temp = head;
            head  = head.next;
            return head;
        }

        int count = 0;
        Node temp = head, pre = null;
        while (temp != null){
            count++;
            while (count == k){
                pre.next = pre.next.next;
                break;
            }
            pre = temp;
            temp = temp.next;
        }
        return head;
    }

    public static Node deleteData(Node head, int value){
        if (head == null)
            return head;

        if (head.data == value){
            Node temp = head;
            head = head.next;
            return head;
        }
        Node temp = head, pre = null;
        while (temp != null){
            if (temp.data == value){
                pre.next = pre.next.next;
                break;
            }
            pre = temp;
            temp = temp.next;
        }
        return head;
    }
}
