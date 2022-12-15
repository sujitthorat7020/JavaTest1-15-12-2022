package exam1;
import java.util.Scanner;
public class whileloop {
      public static void main(String args[])
      {
    	  int i;
    	  int user_pin, pin = 122;
    	  int count=0;
    	   Scanner sc = new Scanner(System.in);
    	   
    	   for(i=0;i<3;i++)
    	   {
    		   System.out.println("Enter pin: ");
    		   user_pin =sc.nextInt();
    		   
    		   if(user_pin == pin)
    		   {
    			   System.out.println("Correct,welcome back");
    		
    			   break;
    			   
    		   }
    		   else 
    		   {
    			   System.out.println("Incorrect try again");
    			   count++;
    			   
    			   
    		  }
    		   
    	   }
    	   if(count >= 3)
    	   {
    		   System.out.println("Sorry you have been locked out");
    		   
    	   }
    	   
    	   sc.close();
      }
}
