//Nathan Rankopo 
//18000441
package Lab2;

public class Question3 
{

    public static void main(String args[]) 
    {
        for(int i = 0; i < 13; i+=2) 
        {
             for(int j = 0; j < i; j++) 
            {
             System.out.print("*");
            } 
            System.out.println("*");
        }
        for(int i = 1; i < 15; i+=2) 
        {
             for(int j = 13; j > i; j--) 
            {
             //output statemetnt
             System.out.print("*");
            } 
             //output statemetnt
            System.out.println("*");
        }
    }
}
