class ConstTest
	{
	public static void main(String[] args)
	{
		Demo d= new Demo();
		d.add();
	}
	}
class Demo
{
	int a;
	int b;
Demo()
	{
	a=10;
	b=20;
System.out.println("Automatically called ");
 }
 void add()
	{
	System.out.println("Addition is " + (a+b));
 }
 }