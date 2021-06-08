package objecttype;


public class PersonLinkedList {

    private Node head;

    public PersonLinkedList(Person person) {
        head = new PersonLinkedList.Node();
        head.person = person;
        head.link = null;
    }

    public boolean insertItem(Person person) {
       Node n = new Node();
       Node new_node = new Node();
        new_node = head;
        while (new_node.link!=null) {
            new_node = new_node.link;
        }
        n.person = person;
        n.link = null;
        new_node.link = n;
        return true;
    }

    public void printList() {
       Node n = head;
        while (n != null) {
            System.out.println(n.person);
            n = n.link;
        }
    }

    public boolean delete(String name) {
        if (name.equals(head.person.getName())) {
            head = head.link;
            return true;
        } else {
            Node x = head;
            Node y = head.link;
               while ((y != null) && !(y.person.getName().equals(name))) {
                   x =y;
                   y = y.link;
                }
            if (y != null) {
                x.link = y.link;
                return true;
            } else {
                return false;
            }

        }
    }
    //sorting the elements in descending order
    /*public void sortList() {
        int c=0;
        PersonLinkedList.Node a = head.link;
        while (a.link!=null)
        {
            PersonLinkedList.Node b = head.link;
            while(b.link!= null) {
                if(b.person < b.link.person) {
                    c = b.value;
                    b.value = b.link.value;
                    b.link.value = c;
                }
                b = b.link;
            }
            a = a.link;
        }
    }*/


    class Node {
        private Person person;
        private Node link;
    }
}
