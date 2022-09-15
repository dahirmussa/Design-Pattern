public class Studentclient
{
public static void main(String args[])
{
Student s1 = new Student.StudentBuilder(12341, "sam", "zack")
                .setAddress("Address")
                .setAge(21)
                .setPhone(435435246)
                .buildStudent();
System.out.println("Student1: " + s1.toString());

Student s2 = new Student.StudentBuilder(1225, "zyan", "adam")
                .setAge(18)
                .buildStudent();
System.out.println("Student2 : " + s2);
 }
}