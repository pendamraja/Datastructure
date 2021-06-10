package inttype;

import java.util.Scanner;

public class LinkedListTest {

    static Scanner sc = new Scanner(System.in);
    static LinkedList linkedList = new LinkedList();

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        displaymenu();
    }
    private static void switchOnIntegers(int options) {
        switch (options) {
            case 1:
                additem();
                break;
            case 2:
                display();
                break;
            case 3:
                delete();
                break;
            case 4:
                additematSpecificIndex();
                break;
            case 5:
                sortlist();
                break;
            case 6:
                deleteatspecificIndex();
                break;

            case 7:
                exit();

        }
    }

    public static void displaymenu() {
        System.out.println("Single Linked List Menu, Use Below options");
        System.out.println("1. Add Item");
        System.out.println("2. Display Items");
        System.out.println("3. Delete Item");
        System.out.println("4. Add Item at Specific Index");
        System.out.println("5. Sort List");
        System.out.println("6. Delete Item at Specific Index");

        System.out.println("4. Exit");
        for (int i = 1; i <= 10; i++) {
            switchOnIntegers(sc.nextInt());
        }

    }


    public static void additem() {
        System.out.println("How many Items are adding in LinkedList");
        int noofItems = sc.nextInt();
        for (int i = 1; i <= noofItems; i++) {
            System.out.println("Enter Items");
            int item = sc.nextInt();
            linkedList.insertItem(item);
        }
        displaymenu();
    }

    public static void additematSpecificIndex() {
        System.out.println("Enter Index to adding in LinkedList");
        int index = sc.nextInt();
        System.out.println("Enter Item to adding in LinkedList");
        int value = sc.nextInt();
        boolean result = linkedList.insertAt(index, value);
        if (result) {
            System.out.println(value + "- Added in List");
        }
        displaymenu();
    }

    public static void deleteatspecificIndex() {
        System.out.println("Enter Index Delete From LinkedList");
        int index = sc.nextInt();
        boolean result = linkedList.deleteAt(index);
        if (result) {
            System.out.println(index + "- Item Deleted");
        }
        displaymenu();
    }

    public static void sortlist() {
        System.out.println("Which Order do you Sort, Enter 'A' or 'D' ");
        char order = sc.next().charAt(0);
        linkedList.sortList(order);
        display();
        displaymenu();
    }

    public static void display() {
        System.out.println("Items in Linked List:");
        linkedList.display();
        displaymenu();
    }

    public static void delete() {
        System.out.println("Which Item you want to delete from List:");
        int value = sc.nextInt();
        boolean result = linkedList.delete(value);
        if (result) {
            System.out.println(value + " - Deleted.");
        }
        displaymenu();
    }

    public static void exit() {
        System.out.println("End Process.....");
        System.exit(0);
    }


}
