import java.util.ArrayList;
import java.util.List;

public class Student implements Cloneable{

	private List<String> StudentList;

	public Student()
	{
		StudentList = new ArrayList<String>();
	}

	public Student(List<String> list){
		this.StudentList=list;
	}
	public void loadData()
	{
		StudentList.add("firstname");
		StudentList.add("lastname");
		StudentList.add("course");
	}

	public List<String> getStudentList()
	{
		return StudentList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException
	{
			List<String> student = new ArrayList<String>();
			for(String s : this.getStudentList()){
				student.add(s);
			}
			return new Student(student);
	}

}
