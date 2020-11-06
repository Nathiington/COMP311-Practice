//Nathan Rankopo 
//18000441
//Question 5
//A program that calculate the value of x given the formula for a quadratic equation where a = 3, b= 10 and c = -25.

//Defines the package where the class is stored
package Lab1;
//imported package to round off to 2 decimal places
import java.text.DecimalFormat;

//name of the class
public class Quadratic 
{
    //main method/function of the class
    public static void main(String args[])
    {
        //declarations of variables used
        int a = 3;
        int b = 10;
        int c = -25;
        
        //calculations
        int d = 4*a*c;
        int e = (b*b)-d;
        
        //using Math library to calculate the square root
        double f = Math.sqrt(e);
        
        double pos_x = (-b + f)/(2*a);
        double neg_x = (-b - f)/(2*a);
        
        //lines to output the value to 2 decimal places
        DecimalFormat z = new DecimalFormat("##.00");
        System.out.format("The value of x: " + z.format(pos_x) + " or: " + z.format(neg_x) + "\n");
    }
}
