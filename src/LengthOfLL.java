public class LengthOfLL {

    public static int FindLength(Node head){
        Node temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
