import java.util.Scanner;
public class SwapNumbersWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the first number");
	    int firstNum=sc.nextInt();
	    System.out.println("Enter the second number");
	    int secondNum=sc.nextInt();
	    System.out.println("Numbers before reversed");
	    System.out.println("First number "+firstNum);
	    System.out.println("Second number "+secondNum);
	    firstNum=firstNum+secondNum;
	    secondNum=firstNum-secondNum;
	    firstNum=firstNum-secondNum;
	    System.out.println("Numbers after reversed ");
	    System.out.println("First number "+firstNum);
	    System.out.println("Second number "+secondNum);
	}

}
