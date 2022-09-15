public class Person extends Student {

    private String firstname;
    private String lastname;
    private int age;
    private String course;

    public Person(String firstname, String lastname,int age, String course){
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
        this.course=course;
    }

    public String getfirstName() {
        return this.firstname;
    }


    public String getlastName() {
        return this.lastname;
    }


    public int getAge() {
        return this.age;
    }

    public String getCourse() {
	  return this.course;
    }

}