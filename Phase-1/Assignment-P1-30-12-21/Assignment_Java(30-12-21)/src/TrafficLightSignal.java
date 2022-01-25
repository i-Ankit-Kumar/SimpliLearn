import java.util.Scanner;
public class TrafficLightSignal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Choose button 1 or 2 or 3  from the below signal light");
      System.out.println("1. Red");
      System.out.println("2. Yellow");
      System.out.println("3. Green");
      int color=sc.nextInt();
      switch(color) {
       
      case 1: 
    	       System.out.println("Stop!!");
    	       break;
      
      case 2:
    	       System.out.println("Ready!!");
	           break;
 
      case 3:
    	       System.out.println("Go!!");
	           break;
 
      default:
    	       System.out.println("Invalid Input");
               break;
      
      }
	}

}
