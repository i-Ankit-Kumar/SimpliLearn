import java.util.Scanner;
public class FindFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num=sc.nextInt();
    int fact=1;
    if(num==0) {
    	System.out.println("The factorial of a number is: "+ 1);
    	System.exit(0);
    }
    while(num>0) {
    	fact=fact*num;
    	num--;
    }
    System.out.println("The factorial of a number is: "+ fact);
	}

}

