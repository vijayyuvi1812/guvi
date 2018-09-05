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
		int numbers[]=new int[n];
		for(int i=0;i<n;i++)
		{
			numbers[i]=sc.nextInt();
		}
		int smallest = numbers[0];
		int largest = numbers[0];
		
		for(int i=1; i< numbers.length; i++)
		{
			if(numbers[i] > largest)
				largest = numbers[i];
			else if (numbers[i] < smallest)
				smallest = numbers[i];
			
		}
		
		System.out.println(smallest+" "+largest);
		
	}
}
