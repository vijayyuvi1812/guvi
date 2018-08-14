import java.util.*;

class Series {
    public static void main(String args[]) {
        int a, d, n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        a = sc.nextInt();
        d = sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
        {
                sum=sum+a;
                a=a+d;
        }
        System.out.print(sum); 
    }
}
