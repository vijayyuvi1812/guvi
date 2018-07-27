import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter num1");
		int num1=Sc.nextInt();
		System.out.println("enter num2");
		int num2=Sc.nextInt();
		System.out.println("enter num3");
		int num3=Sc.nextInt();
		int largest1=num1>num2?num1:num2;
		int largest=largest1>num3?largest1:num3;
		System.out.println("largestnumber is"+largest);
	}
}
