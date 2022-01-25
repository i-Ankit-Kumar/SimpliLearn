import java.util.Scanner;
public class DifferenceBetweenSumofsquaresAndSquareofsum {
    static int sumOfSquares,squareOfSum,difference,number;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
	  number=sc.nextInt();
	  DifferenceBetweenSumofsquaresAndSquareofsum r= new DifferenceBetweenSumofsquaresAndSquareofsum();
	  r.sumOfSquares();
	  
	}

	void sumOfSquares() {
		for(int i=1;i<=number;i++)
		{
			sumOfSquares+=i*i;
		}
		squareOfSum();
	}
	void squareOfSum() {
		int sum=0;
		for(int i=1;i<=number;i++)
		{
			sum+=i;
		}
		squareOfSum=sum*sum;
		display();
	}
	void display() {
		System.out.println("The Difference Between Sumofsquares And Squareofsum is: "+ (  squareOfSum - sumOfSquares));
		
	}
	
	
	
	
	
	
	
}
