public class Natural 
{
    public static void main(String args[])
    {
        int x, i = 1 ;
        int sum = 0;
        System.out.println("Enter Number of items :");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        while(i<=x)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of "+x+" numbers is :"+sum);
    } 
