import java.util.*;
public class Prime
{
    public static void main(String[] args)
    {
        int num, i, count=0;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
		
        for(i=2; i<num; i++)
        {
            if(num%i == 0)
            {
                count++;
                break;
            }
        }
        if(count == 0)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
}
