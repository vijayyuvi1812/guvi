import java.util.*;
public class Multiples
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);       
	int n=s.nextInt();
        for(int i=1; i <= 5; i++)
        {
            System.out.println(n*i);
        }
    }
}
