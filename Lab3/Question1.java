package Lab3;
//package used for import statement
import java.util.Scanner;


public class Question1 
{
    public static void main(String args[])
    {
        //statement to help declare input statement
        Scanner scanf = new Scanner(System.in);
        
        //declaration of variables
        int x,y;
        
        //input of variables
        System.out.println("Enter value for x");
        x = scanf.nextInt();
        System.out.println("Enter value for y");
        y = scanf.nextInt();
        //statement to check condition
        if(x>y)
        {
            //output statement
            System.out.println("I like Java");
        }
        else
        {
             //output statement
            System.out.println("y is greater than x");
        }
    }
}
