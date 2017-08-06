interface A
{ 
	void show();
	void update();
}
	
interface B
{
	public void hello();
	}

class C implements A, B
{
	public void show()
	{
		System.out.println("show method");
	}
	public void update()
	{
		System.out.println("show update");
	}
	public void hello()
	{
		System.out.println("hellooool...");
	}
}
class N
{
public static void main(String[]bla)
{
	C obj=new C();
	obj.show();
	obj.update();
	obj.hello();
}
}
		

	
	