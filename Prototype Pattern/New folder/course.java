
public class course extends Student
{

   private String firstname;
   private String lastname;
   private int age;
   private String course;
   private Person person;


    public course(String firstname, String lastname, int age ,String course , Person person)
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
        course courseObject = null;
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
      return "firstname = " + firstname + " Person = " + person.getPerson();
    }

     //this set method
       public void setPerson(String person)
       {
   		person.setPerson(person);
	}

}
