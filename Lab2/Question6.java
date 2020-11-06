//Nathan Rankopo 
//18000441
package Lab2;

import java.util.Scanner;
/*Assumption:Fibonacci numbers are calculated by adding the first 2 digit from your right to get the 3rd digit
if there are 2 digits 0 is added to the first digit to get the one on the right
*/
public class Question6 
{
    public static void main(String args[])
    {
        int x;
         //statement to get input from a user
         Scanner scanf = new Scanner(System.in);
         System.out.println("Enter a number");
         x = scanf.nextInt();
         int fib = x;
         
         if(fib<100)
         {
             //test value; output = true
             //11
             int num=fib%10;//1
             int num2=fib/10;//1.1
             num2 = num2%10;//1
             if((num2==num + 0))//1=1+0
             {
                 System.out.println("True");
             }
             else
             {
                 System.out.println("False");
             }
         }
         else if(fib<1000)
         {
            //test value; output = true
             //532
             int num=fib%10;//2
             int num2=fib/10;//53.2
             num2 = num2%10;//3
             int num3= fib/100;//5.32
             if((num3==num2 + num))//5=3+2
             {
                 System.out.println("True");
             }
             else
             {
                 System.out.println("False");
             }
         }
         
        
    }
}
