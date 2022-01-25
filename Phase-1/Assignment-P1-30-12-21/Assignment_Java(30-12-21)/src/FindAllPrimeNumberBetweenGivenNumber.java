import java.util.Scanner;
public class FindAllPrimeNumberBetweenGivenNumber 
{

	public static void main(String args[])
    {
           int num,count;
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the value till where you want prime numbers to print:  ");
           num=sc.nextInt();
           System.out.println("Prime Numbers are : ");
           for(int i=2;i<=num;i++)
              {
                  count=0;
                  for(int j=2;j<=i/2;j++)
                  if((i%j)==0)
                      {
                        count=1;
                        break;
                      }
                  if(count==0)
                  System.out.print(i+"  ");
              }
    }

}
