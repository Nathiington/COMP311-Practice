//Nathan Rankopo 
//18000441
//Question 3
//A java program to calculate the length of one side of a hexagon given the area as A = 43 cm

//Defines the package where the class is stored
package Lab1;
//imported package to round off to 2 decimal places
import java.text.DecimalFormat;
//name of the class
public class Length 
{
    //main method/function of the class
    public static void main(String args[])
    {
        //declarations of variables used
        double A = 43.0;
        //using Math library to calculate the power and the square root
        double v = Math.pow(3, 0.25)*Math.sqrt((2*A)/9);
        
        //lines to output the value to 2 decimal places
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println( "The length of one side of a hexagon given the area as A = 43cm: " +f.format(v));
    }
}
