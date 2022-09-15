public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int phone;
    private String address;
    private String course;

   public Student(StudentBuilder studentBuilder)
   {
        this.id = studentBuilder.id;
        this.firstName = studentBuilder.firstName;
        this.lastName = studentBuilder.lastName;
        this.age = studentBuilder.age;
        this.phone = studentBuilder.phone;
        this.address = studentBuilder.address;
        this.course = studentBuilder.course;
    }
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public int getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }

   public String getCourse() {
        return course;
    }

    public String toString()
    {
        return "Student{" +"id=" + id +", firstName='" + firstName + '\'' +", lastName='" + lastName + '\'' +", age=" + age +
               ", phone='" + phone + '\'' +
               ", address='" + address + '\'' +
              ", course='" + course + '\'' +
               '}';
    }
    public static class StudentBuilder
    {
        private int id;
        private String firstName;
        private String lastName;
        private int age;
        private int phone;
        private String address;
        private String course;

        public StudentBuilder(int id, String firstName, String lastName)
        {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public StudentBuilder setAge(int age)
        {
            this.age = age;
            return this;
        }
        public StudentBuilder setPhone(int phone)
        {
            this.phone = phone;
            return this;
        }
        public StudentBuilder setAddress(String address)
        {
            this.address = address;
            return this;
        }

        public StudentBuilder setcourse(String course)
		{
		 this.course = course;
		 return this;
        }
        public Student buildStudent()
        {
            return new Student(this);
        }

    }
}