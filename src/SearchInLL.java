public class SearchInLL {

    public static boolean searchInLL(Node head, int key){
        Node temp = head;
        while (temp != null){
            if (temp.data == key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
