public class client
{

	public static void main(String[] args)
	{
		testAbstractFactory();
	}

	private static void testAbstractFactory()
	{
		 Person P1 = new Person("dahir","mussa",21, "computer science");
		 System.out.println(P1.toString());

		 Person P2 = new Person("sam","abdu",21, "engineering");
		 System.out.println(P2.toString());

	}
}