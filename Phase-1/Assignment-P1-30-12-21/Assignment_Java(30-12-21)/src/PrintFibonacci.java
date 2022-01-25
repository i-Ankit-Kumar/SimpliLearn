//1-89
import java.util.Scanner;
public class PrintFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=0;
       int b=1;
       int c=0;
       System.out.println("The Fibonacci Series below 100 is:");
       System.out.print(b+" ");
       while(c<89) {
    	   c=a+b;
    	   System.out.print(c+" ");
    	   a=b;
    	   b=c;
       }
	}

}
