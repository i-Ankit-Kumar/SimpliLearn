import java.util.*;
public class CheckNumberIsIncreasingOrNot
{
	public static void main(String args[])
	{
       int number;
       int flag = 1;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number : ");
       number = sc.nextInt();
       int currentDigit = number % 10;
       number = number/10;

       while(number>0)
       {
         
           if(currentDigit < number % 10)
           {
               flag = 0;
               break;
           }

           currentDigit = number % 10;
           number = number/10;
       }
 
       if(flag==0)
           System.out.println("Number are not in increasing order."); 
       else
           System.out.println("Number are in increasing order.");
      
    }

}
