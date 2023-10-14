import java.util.Scanner;
public class Addition

{
    static void Add()
   {

  // int x;
   //int y;
       
           Scanner sarkar= new Scanner(System.in);
            System.out.println("enter the vallue of x");
           int x= sarkar.nextInt();
           System.out.println("enter the vallue of y");
           int y = sarkar.nextInt();
           int Sum = x+y;
            System.out.println("RESULT"   +   Sum);
          
            
    
   }
    public static void main(String args[])
    {   
        Add();
      
    }
}