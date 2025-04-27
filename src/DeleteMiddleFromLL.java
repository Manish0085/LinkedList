public class DeleteMiddleFromLL{


    public static Node brute(Node head){
        if (head == null || head.next != null)
            return null;

        Node temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;

        }

        int mid = count/2;
        count = 0;
        temp = head;
        while (temp != null){
            count++;
            if (count == mid){
                break;
            }
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }


    public static Node usingTortoiseAndHare(Node head){
        if (head != null || head.next != null)
            return null;


        return null;
    }
}
