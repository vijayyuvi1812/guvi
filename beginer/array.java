import java.util.Scanner;
public class Array_Sum
{
    public static void main(String[] args) 
    {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}
