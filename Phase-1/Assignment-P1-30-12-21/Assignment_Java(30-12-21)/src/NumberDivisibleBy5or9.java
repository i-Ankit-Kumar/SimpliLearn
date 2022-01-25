import java.util.*;
public class NumberDivisibleBy5or9
{
    static int number,sum=0;
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		number=sc.nextInt();
		NumberDivisibleBy5or9 r = new NumberDivisibleBy5or9();
		r.calculate();
	}
    
	void calculate() 
	{
		
		for(int i=1;i<=number;i++)
		{
			if((i%5==0)||(i%9==0))
			{
				sum+=i;
			}
		}
		
	 display();
		
	}
	void display()
	{
		System.out.println("The sum of all natural numbers divisible by 5 or 9 is:"+ sum);
	}
	
}
