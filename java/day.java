﻿import java.util.Scanner;
import java.util.Date;
class Test
{
   public static void main(String ... args)
   {
	   Date d=new Date(0);
	   System.out.println(d);
	   int day=d.getDay();
	   
	  switch("day")
	  {
		  
		  case 0: System.out.println("Sunday");
		  break;
		  case 1: System.out.println("Monday");
		  break;
		  case 2: System.out.println("Tuesday");
		  break;
		  case 3: System.out.println("Wednesday");
		  break;
		  case 4: System.out.println("Thrusday");
		  break;
		  case 5: System.out.println("Friday");
		  break;
		  case 6: System.out.println("Saturday");
		  break;
		  
		  default :System.out.println("Please Enter A number between 0-6");
		 
	  }
	
	   
	  
   }
}