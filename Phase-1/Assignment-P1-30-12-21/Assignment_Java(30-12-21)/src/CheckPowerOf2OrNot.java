import java.util.Scanner;
public class CheckPowerOf2OrNot {

	 
    static boolean isPowerOfTwo(int num)
    {
        if (num == 0)
            return false;
 
        while (num != 1) {
            if (num % 2 != 0)
                return false;
            num/=  2;
        }
        return true;
    }
 
    
    public static void main(String args[])
    {  
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number ");
    	int number=sc.nextInt();
        if (isPowerOfTwo(number))
            System.out.println(number+" is a Power of 2");
        else
            System.out.println(number+" is not a Power of 2");
 
       
    }

}
