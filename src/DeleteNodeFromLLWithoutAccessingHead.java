public class DeleteNodeFromLLWithoutAccessingHead {

    public static void deleteNode(Node node){

        if (node == null || node.next == null)
            return;


        node.data = node.next.data;
        node.next = node.next.next;

    }
}
