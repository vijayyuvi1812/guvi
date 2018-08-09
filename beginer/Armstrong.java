import Java.util.*;
class Armst{  
  public static void main(String[] args)  {   
Scanner sc= new Scanner(System.in);
    int c=0,a,t;  
int n=sc.nextInt();
    t=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(t==c)  
    System.out.println("Yes");   
    else  
        System.out.println("No");   
   }  
}  
