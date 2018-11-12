import java.util.Scanner;
public class Array_Sum
{
    public static void main(String[] args) 
    {
        int n,k,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<k;i++)
        {
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}
