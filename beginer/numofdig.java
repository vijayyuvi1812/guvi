import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter any integer");
		int n=sc.nextInt();
		int num=0;
		while(n>0)
		{
			n=n/10;
			num++;
		}
		System.out.println("number of digits are "+num);
	}
}
