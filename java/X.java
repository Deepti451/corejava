class X {
		void test()
		{
		System.out.println("here is void test method");
		}
	test(int a)
		{
			System.out.println(" the value of a " + a);
				return a;
		}
	double test( double a , double b)
		{
			return a*b;
				System.out.println(a*b);
		}
}
	class B
{
		

	public static void main(String arg[])
	{
		X ob=new X();
		ob.test();
		ob.test(8);
		ob.test(80);
		ob.test(20,40);
	}
	}s