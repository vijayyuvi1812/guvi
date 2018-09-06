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
			sum=sum*10+rem;
			num=num/10;
		}
	
		
    while (sum>0) {
        remainder = sum%10;
        int digit = sum%10;
        sum = sum/10;
        System.out.println(digit);
        }
	}
}
