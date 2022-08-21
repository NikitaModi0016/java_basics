import java.util.Scanner;
class sort
{
	sort(int arr[],int n)
	{
		int i,j,temp;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[j]>arr[i])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	System.out.println("The sorted array:");
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+"  ");
		}
	}

public static void main(String args[])
{
	int n,i;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of an array:");
	n=s.nextInt();
	int a[]=new int[n];
	System.out.println("Enter the element:");
	for(i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	sort ob=new sort(a,n);

}
}