import java.util.*;
class PalindromeExample{  
 public static void main(String[] args){  
  int r,sum=0,t;   
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
  t=n;    
  while(n>0){    
   r=n%10; 
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(t==sum)    
   System.out.println(" yes");    
  else    
   System.out.println("no");    
}  
}  
