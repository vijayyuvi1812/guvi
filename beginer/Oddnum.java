import java.util.*;
class OddNumber {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
		for (int i = x; i <= y; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
