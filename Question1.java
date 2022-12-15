package exam1;
import java.util.Scanner;


public class Question1 {
   public static void main(String[] args)
   {
	   Scanner s = new Scanner(System.in);
			   int pin =12345;
	    
	   System.out.println("Enter pin of account:");
	   int entry = s.nextInt();
	   
	   while(entry != pin)
	   {
		   System.out.println("Incorrect, try again");
		   System.out.println("Enter pin of account:");
		   entry = s.nextInt();
		   
	   }
	   
			System.out.println("correct, welcome back");   
   }
}
