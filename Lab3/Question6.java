package Lab3;


public class Question6 
{
    static int hello(String a, String b,String c)
    {
        a = "Some ";
        b = "Random ";
        c = "Text";
        System.out.println(a + b + c);
        return 0;
    }
    
    public static void main(String args[])
    {
        String x = "Other";
        String b = "Random";
        String c = "Text";
        hello(x,b,c);
    }
}
//outputs variabele from hello not main