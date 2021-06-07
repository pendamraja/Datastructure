package inttype;

public class Main {
    public static void main(String args[]) {
        Queue queue = new Queue();
        queue.enqueue(2);
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(8);
        queue.enqueue(10);

        //print All items
        queue.printAll();

    }
}
