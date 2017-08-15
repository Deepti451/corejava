import java.util.Random;
class Apples 
	{

	public static void main(String[] args)
	 {
		
		Random dice=new Random();
		int number;
		for(counter=0;counter<=10;counter++)
		{
			number=dice.nextInt(6);
			System.out.println("number" + number);
		}

	}
}
