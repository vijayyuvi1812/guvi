import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		int special=0;
		 
		  for (int i = 0; i < s.length(); i++)
		    {
		    	char str =s.charAt(i);
		    	
		        if (str>= 'A' && str<= 'Z')
		        {
		        }
            		
			else if (str>= 'a' && str<= 'z')
            		{
            		}
			else if (str>= '0' && str<= '9')
            		{
            		}
			 else
		            	special++;
		}
		System.out.println(special);
	}
}
