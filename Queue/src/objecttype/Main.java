package objecttype;

public class Main {
    public static void main(String args[])
    {
        PersonQueue personQueue = new PersonQueue();

        personQueue.enqueue(new Person("Shiva", "100"));
        personQueue.enqueue(new Person("Shanker", "101"));
        personQueue.enqueue(new Person("Kumar", "102"));

        //print all items
        personQueue.printAll();
    }
}
