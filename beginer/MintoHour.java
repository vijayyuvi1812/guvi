
import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		int hours = t / 60; 
		int minutes = t % 60;
		System.out.printf("%d %02d", hours, minutes);

	}
}
