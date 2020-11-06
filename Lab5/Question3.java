package Lab5;

import java.util.Scanner;

public class Question3 
{
    public static void main(String args[])
    {
        Scanner scanf = new Scanner(System.in);                 
        //declaration of 2D array
        int[][] arr = new int[2][2];
        //loop that inputs to the array
        System.out.println("Enter number");
        for (int x = 0; x < 2; x++) 
        {
            for (int y = 0; y < 2; y++) 
            {
                //input of each element
                arr[x][y] = scanf.nextInt();                
            }
        }       
        int sum = arr[0][0]+arr[0][1]+arr[1][0]+arr[1][1];
        System.out.println("Sum is: " + sum);
    }
}
