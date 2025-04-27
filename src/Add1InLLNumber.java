public class Add1InLLNumber {

    public static Node addOne(Node head){
        head = reverse(head);
        Node temp = head;
        int carry = 1;
        while (temp != null){

            temp.data = temp.data + carry;
            if (temp.data < 10){
                carry = 0;
                return reverse(head);
            }
            else {
                temp.data = 0;
                carry = 1;

            }
            temp = temp.next;
        }

        if (carry == 1){
            Node newNode = new Node(1);
            head = reverse(head);
            newNode.next = head;
            return newNode;
        }
        return null;
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

    public static Node backTrack(Node head){
        int carry = helper(head);
        if (carry == 1){
            Node newNode = new Node(1);
            newNode.next = head;
            return newNode;
        }
        return head;
    }

    private static int helper(Node head) {

        if (head == null)
            return 1;

        int carry = helper(head.next);
        head.data = head.data + carry;
        if (head.data < 10)
            return 0;

        head.data = 0;
        return 1;
    }
}
