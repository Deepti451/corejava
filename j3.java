class A
{
	int a=10;
	A()
	{
		System.out.println("A cons");
	}
	}
class B extends A
{
	B()
	{
	System.out.println("value from A cons = "+ a);
		  }
	public static void main(String[]args)
	{
	B b1=new B();
	System.out.println(b1.a);
}
}