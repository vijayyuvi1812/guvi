import java.util.*;
import java.lang.*;

class Rextester
{  
    public static void main(String args[])
    {
        	
        Scanner sc=new Scanner(System.in);
			String s=sc.nextLine();
			int digits=0;
				for(int i=0;i<s.length();i++){
                    if(Character.isDigit(s.charAt(i))){
						digits++;
				}
			}
				System.out.println(digits);
		}
}
