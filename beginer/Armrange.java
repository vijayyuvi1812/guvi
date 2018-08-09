import java.util.*;
public class Armrange
{ 
   public static void main(String[] args) 
            { 
               Scanner s=new Scanner(System.in); 
     int x=s.nextInt();
               int range=s.nextInt(); 
               int a,c,sum;
               x=1; 
               while(x<=range) 
                    { 
                        sum=0; 
                        c=x; 
                        while(c>0) 
                             { 
                                a=c%10; 
                                sum=sum+(a*a*a); 
                                c=c/10; 
                             } 
                         if(sum==x) 
                       { 
                         System.out.println(x); 
                       } 
                          x++; 
                     } 
                } 
} 
