import java.util.Scanner;
class transpose
{
	transpose(int a[][],int n)
	{
		int i,j;
		System.out.println("After transpose the array is:");
		for(i=0;i<n;i++)
		{
		for(j=0;j<n;j++)
		{
			System.out.print(a[j][i]+" ");
		}
			System.out.println();
		}

	}
public static void main(String args[])
{
	int n,i,j;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of an array:");
	n=s.nextInt();
	int a[][]=new int[n][n];
	System.out.println("Enter the 2D elements:");
	for(i=0;i<n;i++)
	{
	for(j=0;j<n;j++)
	{
		a[i][j]=s.nextInt();
	}
	System.out.println();
	}
	System.out.println("Before traspose the array is:");
	for(i=0;i<n;i++)
	{
	for(j=0;j<n;j++)
	{
		System.out.print(a[i][j]+" ");
	}
		System.out.println();
	}
	transpose obj=new transpose(a,n);
}
}