package objecttype;

public class Student {
    private String sname;
    private String rollno;
    public Student(String name, String rollno)
    {
        this.sname = name;
        this.rollno = rollno;
    }
    public String toString()
    {
        return "Student Name:" + this.sname + " " +"Rollno :" + this.rollno;
    }
}
