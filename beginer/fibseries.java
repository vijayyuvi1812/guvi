import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		 int a=0,b=1,i,c;
	 
	 for(i=0;i<n;i++)
	 {    
	  c=a+b;    
	  System.out.print(" "+b);    
	  a=b;    
		b=c;    
	}
}
}