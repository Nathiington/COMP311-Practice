//Nathan Rankopo 
//18000441
package Lab2;
import java.util.Scanner;
public class Question4 
{
    public static void main(String args[])
    {
        //statement to get input from a user
        Scanner scanf = new Scanner(System.in);
        float f;
        //output statemetnt
        System.out.println("Enter a number");
        f = scanf.nextFloat(); 
        //conditional statement
        if(f==0)
        {
            //output statemetnt
            System.out.println("Zero");
        }
        else if(f>0)
        {
            //output statemetnt
            System.out.println("Positive");  
        }
        else if(f<0)
        {
            //output statemetnt
            System.out.println("Negative");
        }
        
    }
}