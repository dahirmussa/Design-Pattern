public class Course1 extends Student
{
    private String firstname;
    private String lastname;
    private int age;
    private String course;
    private Person person;

    public Course1(String firstname, String lastname,int age, String course,Person person)
    {
    this.firstname=firstname;
	this.lastname=lastname;
    this.age=age;
	this.course=course;
	this.person = person;
    System.out.println("course Constructor.");
    }

     public Student makeClone()
	 {
	   Course courseObject = null;
	   try{
	       courseObject = (course)super.clone();
	       courseObject.person = (Person)person.clone();
	      }
	       catch(CloneNotSupportedException e){
	        e.printStackTrace();
	       }
	      return courseObject;
    }
    public void setfirstName(String firstname)
    {
	  this.firstname = firstname;
	}

    public void setlastName(String lastname)
    {
	 this.lastname = lastname;
	}

    public void setAge(int age)
    {
	  this.age = age;
	}

	public void setCourse(String course)
	{
     this.course = course;
     }

     public String toString()
	 {
	  return "firstName= "+firstName+"lastName="+lastName+", Age="+Age+", Course="+Course + " Person = " + person.getPerson();
	 }

	 public void setPerson(String P1)
	 {
	 		person.setPerson(p1);
	  }
}
