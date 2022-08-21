import java.util.Scanner;
class prime
{
	prime(int n)
	{
		int i;
		int flag=1;
		if(n==0||n==1)
		{
			System.out.println(n+" "+ "is not prime number");
		}
		for(i=2;i<=n;i++)
		{
			if(n%2==0)
			{
				System.out.println(n+" "+"is not prime number");
				flag=0;
				break;
			}
		}
		if(flag==1)
		{
		System.out.println(n+" "+"is prime number");
		}
	}
public static void main(String args[])
{
	int n;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the element:");
	n=s.nextInt();
	prime obj=new prime(n);
	
}
}