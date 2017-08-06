public class A
	{	int j=10;
{
	System.out.println("test 1");
	}
}
public class B extends A
{	void test()
	{
	System.out.println("test");
	}
public static void main(String[]args)
	{
		B.b1= new B();

		System.out.println(b1.j);
		b1.test();
	}
}

	