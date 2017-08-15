import java.util.Scanner;
class StringBufferDemo
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner (System.in);
		String st="";
		System.out.println("Enter the string to be reversed.....");
		String s=sc.nextLine();
	int length=s.length();
	for(int i=length-1;i>=0;i--)
		st=st+s.charAt(i);
	 
      System.out.println(st);

	
	
	
  }
}