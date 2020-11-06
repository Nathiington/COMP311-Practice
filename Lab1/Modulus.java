//Nathan Rankopo 
//18000441
//Question 4
//A program that calculates the remainder when one value is divided by another

//Defines the package where the class is stored
package Lab1;

//name of the class
public class Modulus 
{
    //main method/function of the class
    public static void main(String args[])
    {
        //declarations of variables used
       int sum = 55;
       int num = 12;
       
       //using modulus to calculate the remainder
       int rem = sum%num;
       
       //line to output the value
       System.out.println("The remainder when sum is divided by num: " + rem);
    }
}
