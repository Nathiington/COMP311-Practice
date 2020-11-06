package Lab4; 

 //package used for inputs 
import java.util.Scanner; 

public class Question2 
{ 
      public static void main(String args[])  
    {  
        //input statements 
        Scanner scanf = new Scanner(System.in); 
        System.out.println("Enter some text"); 
        String text = scanf.nextLine();  
        int uppercase = 0;  
        
        //loop to count the number of uppercase letters 
        for(int i = 0; i < text.length(); i++)  
        {  
            char character = text.charAt(i);  
            if (character >= 'A' && character <= 'Z')  
                uppercase++;  
        }  
        //output 
        System.out.println("Uppercase letters : " + uppercase);  
    }  
} 