public class SortListOf012 {


    public static Node brute(Node head){
        int count0 = 0, count1 = 1, count2 = 2;
        Node temp = head;
        while (temp != null){
            if (temp.data == 0)
                count0++;
            else if (temp.data == 1)
                count1++;
            else
                count2++;

            temp = temp.next;
        }

        temp = head;
//        while (count0 > 0){
//            temp.data = 0;
//            count0--;
//            temp = temp.next;
//        }
//
//        while (count1 > 0){
//            temp.data = 1;
//            count1--;
//            temp = temp.next;
//        }
//
//        while (count2 > 0){
//            temp.data = 2;
//            count2--;
//            temp = temp.next;
//        }

        while (temp != null){
            if (count0 > 0){
                temp.data = 0;
                count0--;
                temp = temp.next;
            }
            else if (count1 > 0){
                temp.data = 1;
                count1--;
                temp = temp.next;
            }
            else  {
                temp.data = 2;
                count2--;
                temp = temp.next;
            }

        }

        return head;
    }

    public static Node optimised(Node head){
        if (head == null || head.next == null)
            return head;

        Node zeroHead = new Node(-1);
        Node zero = zeroHead;
        Node oneHead = new Node(-1);
        Node one = oneHead;
        Node twoHead = new Node(-1);
        Node two = twoHead;

        Node temp = head;
        while (temp != null){
            if (temp.data == 0){
                zero.next = temp;
                zero = temp;
            }
            else if (temp.data == 1){
                one.next = temp;
                one = temp;
            }
            else {
                two.next = temp;
                two = temp;
            }

            temp = temp.next;
        }

        zero.next = (oneHead.next != null)? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;

        Node newNode = zeroHead.next;

        return newNode;
    }
}
