package inttype;

public class LinkedList {
    Node head;

    class Node {
        int value;
        Node next;
    }

    public LinkedList() {
        head = new Node();
        head.value = 0;
        head.next = null;
    }

    public boolean insertItem(int item) {
        Node n = new Node();
        Node new_node = new Node();
        new_node = head;
        while (new_node.next != null) {
            new_node = new_node.next;
        }
        n.value = item;
        n.next = null;
        new_node.next = n;
        return true;
    }

    public void display() {
        Node n = head.next;
        while (n != null) {
            System.out.println(n.value);
            n = n.next;
        }
    }

    public boolean delete(int item) {
        if (head.next.value == item) {
            head.next = head.next.next;
            return true;
        } else {
            Node x = head;
            Node y = head.next;
            while (true) {
                if (y == null || y.value == item) {
                    break;
                } else {
                    x = y;
                    y = y.next;
                }
            }
            if (y != null) {
                x.next = y.next;
                return true;
            } else {
                return false;
            }
        }
    }
    private void insertAtStart(int item) {
        Node node = new Node();
        node.value = item;
        node.next = null;
        node.next = head;
        head = node;
    }
    public boolean insertAt(int index, int item) {
       Node node = new Node();
        node.value = item;
        node.next = null;
        if (index == 0) {
            insertAtStart(item);
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;

        }
        return true;
    }
    public boolean deleteAt(int index){
        try {
            if (index == 0) {
                head = head.next;
            } else {
                Node n = head;
                Node n1 = null;
                for (int i = 0; i < index - 1; i++) {
                    n = n.next;
                }
                n1 = n.next;
                n.next = n1.next;
            }

        }
        catch(Exception ne)
        {
            System.out.println(index +"- Index is not store any number");
        }
        return true;
    }

    public void sortList(char order) {
        if (order == 'D') {
            int c = 0;
            Node a = head.next;
            while (a.next != null) {
                Node b = head.next;
                while (b.next != null) {
                    if (b.value < b.next.value) {
                        c = b.value;
                        b.value = b.next.value;
                        b.next.value = c;
                    }
                    b = b.next;
                }
                a = a.next;
            }
        }
        else {
            int c = 0;
            Node a = head.next;
            while (a.next != null) {
                Node b = head.next;
                while (b.next != null) {
                    if (b.value > b.next.value) {
                        c = b.value;
                        b.value = b.next.value;
                        b.next.value = c;
                    }
                    b = b.next;
                }
                a = a.next;
            }
        }
    }
}
