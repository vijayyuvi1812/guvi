import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String rev="";
	 Scanner sc = new Scanner(System.in);
	  String s = sc.nextLine();
	int length =s.length();
	      for ( int i = length - 1 ; i >= 0 ; i-- )
	         rev = rev + s.charAt(i);
 
	      System.out.println(rev);
    	}
}
