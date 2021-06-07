package inttype;

public class Main {

    public static void main(String args[]) {
        IntLinkedList linkedList = new IntLinkedList();
        linkedList.insertItem(3);
        linkedList.insertItem(9);
        linkedList.insertItem(12);
        linkedList.insertItem(6);


        //print all
        linkedList.printList();

        //sort the
        linkedList.sortList();
        System.out.println("After sort: ");
        linkedList.printList();

        /*linkedList.delete(3);

        System.out.println("After removing iteam: ");

        linkedList.printList();*/
    }
}
