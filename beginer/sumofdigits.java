import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int remainder,sum=0,rem;
		int num=n;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.print(sum);
	}
}
