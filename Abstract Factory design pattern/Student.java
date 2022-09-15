public abstract class Student
{
  public abstract String getfirstName();
  public abstract String getlastName();
  public abstract int getAge();
  public abstract String getCourse();

  public String toString()
  {
    return "firstName= "+this.getfirstName()+", lastName="+this.getlastName()+", Age="+this.getAge()+", Course="+this.getCourse();
  }
}