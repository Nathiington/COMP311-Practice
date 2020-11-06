//Nathan Rankopo 
//18000441
package Lab2;

import java.util.Scanner;


public class Question5 
{
    public static void main(String args[])
    {
        int x;
        int prod;
         //statement to get input from a user
         Scanner scanf = new Scanner(System.in);
         System.out.println("Enter a number");
         x = scanf.nextInt();
         //loop statement
         for(int i = 0;i<7;i++)
         {
             prod=x*i;
             System.out.println(x+"*"+i+"="+prod);
         }
    }
}
