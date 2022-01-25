import java.util.*;
public class CheckPalindromeString {

	public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the String");
	 String Str= sc.next();
	 isPalindrome(Str);     
	}
	
	static void isPalindrome(String str)
	{
		int end=str.length()-1;
		int start=0;
		while(start<end)
		{
			if(str.charAt(start)!=str.charAt(end)) {
				System.out.println(str+" is not a Palindrome");
				System.exit(0);
			}
			start++;
			end--;
		}
		System.out.println(str+" is a Palindrome");
	}
}
