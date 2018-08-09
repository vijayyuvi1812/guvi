import java.util.*;
public class pbr
{
	public static void main(String[] args)
	{
		int x,y,count = 0, i, j;
		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		y= s.nextInt();
		for(i = x; i <= y; i++)
		{
			for( j = 2; j < i; j++)
			{
				if(i % j == 0)
				{
					count = 0;
					break;
				}
				else
				{
					count = 1;
				}
			}
			if(count == 1)
			{
				System.out.println(i);
			}
		}
	}
}
