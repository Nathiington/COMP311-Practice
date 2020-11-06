//Nathan Rankopo 
//18000441
//Question 2
//A java program that calculates the area of a hexagon.

//Defines the package where the class is stored
package Lab1;
//imported package to round off to 2 decimal places
import java.text.DecimalFormat;

//name of the class
public class Hexagon 
{
    //main method/function of the class
    public static void main(String args[])
    {
        //declarations of variables used
        double a = 3.5;
        //using Math library to calculate the square root
        double x = Math.sqrt(3);
        //calculations
        double y = (x*3)/2;
        double A = y*(a*a);
        
        //lines to output the value to 2 decimal places
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println("The area of a hexagon with length a = 3.5cm is: " + f.format(A));
    }
}
