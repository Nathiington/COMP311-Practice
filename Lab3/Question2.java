package Lab3;
//package used for import statement
import java.util.Scanner;


public class Question2 
{
    public static void main(String args[])
    {
        //statement to help declare input statement
        Scanner scanf = new Scanner(System.in);
        
        //input statement
        System.out.println("Enter the day of the week");
        String day = scanf.nextLine();
        
        //statement to check condition
        switch(day)
        {
            
            case "Monday":
                //output statement
                System.out.println("To day is Monday");
                break;
            case "Tuesday":
                //output statement
                System.out.println("To day is Tuesday");
                break;
            case "Wednesday":
                //output statement
                System.out.println("To day is Wednesday");
                break;
            case "Thursday":
                //output statement
                System.out.println("To day is Thursday");
                break;
            case "Friday":
                //output statement
                System.out.println("To day is Friday");
                break;
            default :
                //default output statement
                System.out.println("Not Weekday");
        }
    }
}
