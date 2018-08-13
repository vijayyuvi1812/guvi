import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
  public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
       	a[i]=sc.nextInt();
       }
 
        Arrays.sort(a);
 
        System.out.printf(" %s",Arrays.toString(a));
    }
}
