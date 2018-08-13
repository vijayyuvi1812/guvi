import java.util.*;
import java.lang.*;

class Rextester
{  
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
       	a[i]=sc.nextInt();
       }
 
        Arrays.sort(a);
        int middle=a.length/2;
        int medianValue = 0; 
if (a.length%2 == 1) 
    medianValue = a[middle];
else
   medianValue = (a[middle-1] + a[middle]) / 2;
        
   System.out.println(medianValue);
    }
}
