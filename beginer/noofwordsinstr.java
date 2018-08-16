import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int word=1;
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				word++;
			}	
		
		}
		System.out.println(word);
	}
}
