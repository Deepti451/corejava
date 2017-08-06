class StringTest
{
   public static void main(String ... at)
   {
	   StringBuffer sb=new StringBuffer(200);
	    System.out.println(sb.capacity());
	   sb.append("Hello to Java");
	   sb.append(" And the Version is 8");
	   
	   sb.insert(9,"Core ");
	   
	  // sb.delete(6,8);
	  sb.replace( 9,14 ,"Advanced ");
	   System.out.println(sb);
	   
	   System.out.println(sb.capacity());
   }
}


