package objecttype;

public class Main {
    public static void main(String args[]) {

        Person person = new Person("rajashekar","1000");
        Person person1 = new Person("Pavan","1002");

        PersonLinkedList list = new PersonLinkedList(person);
        list.insertItem(person1);
        list.printList();

    }
}
