import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any character");
		char ch=sc.next().charAt(0);
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
			System.out.println("character is alphabet");
		}
		else{
						System.out.println("character is not a alphabet");
			}
	}
}
