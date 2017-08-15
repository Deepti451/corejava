import java.util.Scanner;

class Rev
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the string to be reversed.....");
		String s=sc.nextLine();
		String reverse = new StringBuffer(s).reverse().toString();
      System.out.println("\nString before reverse: "+s);
      System.out.println("String after reverse: "+reverse);
   }
		
		}
		
		
		