public class AddTwoNumbers {

    public static Node addTwo(Node head1, Node head2){
        Node t1 = head1;
        Node t2 = head2;
        Node dummyNode = new Node(-1);
        int carry = 0;
        Node current = dummyNode;
        while (t1 != null || t2 != null){
            int sum = carry;
            if (t1 != null)
                sum += t1.data;
            if (t2 != null)
                sum += t2.data;
            Node newNode = new Node(sum%10);
            carry = sum / 10;
            current.next = newNode;
            current = current.next;
            if (t1 != null)
                t1 = t1.next;
            if (t2 != null) {
                t2 = t2.next;
            }
        }
        if (carry > 0){
            Node newNode = new Node(carry);
            current.next = newNode;
        }
        return dummyNode.next;
    }
}
