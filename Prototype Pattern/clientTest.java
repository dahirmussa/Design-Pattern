import java.util.List;
public class clientTest
{
  public static void main(String[] args) throws CloneNotSupportedException {
  Student student = new Student();
  student.loadData();

		//Use the clone method to get the Employee object
		Student student1 = (Student) student.clone();
		 Student student2 = (Student) student.clone();

		List<String> list = student1.getStudentList();
		list.add("age");

		List<String> list1 = student2.getStudentList();
		list1.remove("age");

		System.out.println("student List: "+student.getStudentList());
		System.out.println("student1 List: "+list);
		System.out.println("student2 List: "+list1);
	}

}
