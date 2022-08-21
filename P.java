import java.util.Scanner;
class star
{
	star(int n)
	{
		int i,j;
		System.out.println("The pattern:");
		for(i=1;i<=n;i++)
		{
		for(j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println("");	
		}
	}

	public static void main(String args[])
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=s.nextInt();
		star ob=new star(n);
	}
}