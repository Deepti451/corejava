import java.util.Scanner;

class Factorial 
{
	public static void main(String...args)
	{	int i,s,c=1;
		System.out.println("Enter the number to find its factorial..");
		Scanner n=new Scanner (System.in);
		s = n.nextInt();
		for(i=1;i<=s;i++)
		{
		 c=c*i;
		}
			System.out.println("Factorial is : "  +c);
	}
			
		
	}