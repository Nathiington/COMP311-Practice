package Lab5;
import java.util.Scanner;

public class Question2 
{
   public static void main(String[] args) 
    {
        //input statements
        Scanner scanf = new Scanner(System.in);
        System.out.println("Enter matrix elements");
        
        //declaration of 2D array
        int[][] arr = new int[2][2];
        
        //loop that inputs to the array
        for (int x = 0; x < 2; x++) 
        {
            for (int y = 0; y < 2; y++) 
            {
                //input of each element
                arr[x][y] = scanf.nextInt();               
            }
        }
        
        for (int x = 0; x < 2; x++) 
        {
            System.out.println(" ");
            for (int y = 0; y < 2; y++) 
            {
                //output of each element
                System.out.print(arr[x][y]+" ");               
            }
        }
         System.out.println();
    }
}
