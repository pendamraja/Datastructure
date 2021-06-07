package objecttype;

public class Main {
    public static void main(String args[])
    {
        Student student1 = new Student("Shiva","100");
        Student student2 = new Student("Kumar","101");

        StudentStack studentStack = new StudentStack();

        studentStack.push(student1);
        studentStack.push(student2);

        System.out.println(studentStack.pop().toString());
        System.out.println(studentStack.pop().toString());


    }
}
