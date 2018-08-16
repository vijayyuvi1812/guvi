import java.util.*;
import java.lang.*;

class Rextester
{  
    public static void main(String args[])
    {
        	int count=1;
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='.')
			{
				count++;
			}	
		
		}
		System.out.println(count);
    }
}
