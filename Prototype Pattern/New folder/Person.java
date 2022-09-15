public class Person implements Cloneable // which implements cloneable interface is a marker interface
{

	// attribute which is private string
     private String firstname;


    //constructor contains string code
    Person(String firstname)
    {
      this.firstname = firstname;
    }



    public String getPerson()
    {
      return firstname;
    }
    public void setPerson(String firstname)
    {
	  this.firstname = firstname;
    }

    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone(); // return super.clone
    }
}