import java.util.*;
import java.lang.*;

class Rextester
{  
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=1;i< a.length;i++) {

            if(a[i] < a[i-1] )

            {
    
                a[i] =a[i] +a[i-1];

                a[i -1 ] = a[i] -a[i-1];

                a[i] = a[i] - a[i-1];

                i=0;

            }

           }
           for(int i=0;i<a.length;i++)
           {
                System.out.print(a[i] + " ");
           }
    }
}
