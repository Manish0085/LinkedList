import java.util.Stack;

public class SortLL {

    public static Node usingAnyDS(Node head){
        if (head == null || head.next == null)
            return head;

        Node temp = head;
        Stack<Integer> stack = new Stack<>();
        while (temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }

        stack.sort((a, b) -> b-a);
        temp = head;
        while (temp != null){
            temp.data = stack.pop();
            temp = temp.next;
        }
        return head;
    }

    public static Node mergeSort(Node head){
        if(head == null || head.next == null)
            return head;

        Node middle =  findMiddle(head);
        Node leftHead = head;
        Node rightHead = middle.next;
        middle.next = null;

        return merge(leftHead, rightHead);
    }

    private static Node findMiddle(Node head){
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private static Node merge(Node list1, Node list2){
        Node dummy = new Node(-1);
        Node temp = dummy;
        while (list1 != null && list2 != null){
            if (list1.data < list2.data){
                temp.next = list1;
                temp = list1;
                list1 = list1.next;
            }


            else {
                temp.next = list2;
                temp = list2;
                list2 = list2.next;
            }
        }

        if (list1 != null)
            temp.next = list1;
        else
            temp.next = list2;

        return dummy.next;
    }
}
