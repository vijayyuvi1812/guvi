import java.util.*;
class Factorial{  
 public static void main(String[] args){  
Scanner sc=new Scanner(System.in);
  int i,fact=1;  
  int n=sc.nextInt();
  for(i=1;i<=n;i++){    
      fact=fact*i;    
  }    
  System.out.println(fact);    
 }  
}  
