public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int[] arr = {4, 8, 2, 5, 4};
        ArrayToLinkedList obj = new ArrayToLinkedList();
        Node head = obj.arrToLL(arr);
        Traversing.traverse(head);
        System.out.println(LengthOfLL.FindLength(head));
        System.out.println(SearchInLL.searchInLL(head, 9));

        //Deleting head form LinkedList
        //Traversing.traverse(DeleteHeadFromLL.deleteFirst(head));

        //Deleting tail form LinkedList
        //Traversing.traverse(DeleteTail.deleteTail(head));

        //Deleting Kth node form LinkedList
        //Traversing.traverse(DeleteKthNode.delete(head, 4));

        //Deleting value node form LinkedList
        //Traversing.traverse(DeleteValue.deleteData(head, 2));

        //Insert node as first node in LinkedList
        Traversing.traverse(Insertion.InsertNodeAsFirstNode(head, 53));

        //Insert node as as node in LinkedList
        Traversing.traverse(Insertion.insertTail(head, 93));

        //Insert node at kth position in LinkedList
        Traversing.traverse(Insertion.insertNodeAtKthPos(head, 91, 1));

        //Insert node before value k in LinkedList
        Traversing.traverse(Insertion.insertNodeBeforeVal(head, 21, 5));

    }
}