package Lab4; 
//package to get input from user
import java.util.Scanner; 

public class Question1 
{ 
    public static void main(String args[]) 
    { 
        //input statement
        Scanner scanf = new Scanner(System.in); 
        System.out.println("Input a number: "); 
        int x = scanf.nextInt(); 
         //loop to check if all numbers less than input are odd
        for(int i = x; i>0;i--) 
        { 
            //to check if number is odd
            if(i%2==1) 
            { 
                //output statement
                System.out.println(i); 
            } 
        } 
    } 
} 