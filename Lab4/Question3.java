package Lab4; 
//package used for inputs 
import java.util.Scanner; 

public class Question3 
{ 

    public static void main(String args[])  
    { 
        //input statements 
        Scanner scanf = new Scanner(System.in); 
        System.out.println("Enter some text"); 
        String text = scanf.nextLine(); 
        //loop condition to turn string to ASCII 
        for (int i = 0; i < text.length(); i++)  

        { 
            //conversion of  string to ASCII  
            char num = text.charAt(i); 
            int castAscii = (int) num; 
 
            //ASCII moves by 2 
            castAscii += 2; 

           //Converting ASCII back to string 
            String str = new Character((char) castAscii).toString(); 
            
            //output 
            System.out.print(str); 
        } 
    } 
} 