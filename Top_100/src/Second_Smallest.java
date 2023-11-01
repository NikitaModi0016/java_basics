import java.util.Scanner;
public class Second_Smallest {
	public static int Second_Smallest_Solution(int arr[], int n) {
		int sSmall=Integer.MAX_VALUE;
		int small=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]<small) {
				sSmall=small;
				small=arr[i];
			}
			else if(arr[i]<sSmall && arr[i]!=small){
				sSmall=arr[i];
			}
		}
		return sSmall;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array element: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int Second_small=Second_Smallest_Solution(arr,n);
		System.out.println("The second smallest element is:"+Second_small);
	}

}
