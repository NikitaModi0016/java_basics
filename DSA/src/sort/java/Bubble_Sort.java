package sort.java;
import java.util.Scanner;
public class Bubble_Sort {
	
	public static void Sort(int n,int a[]) {
		int temp,i,j;
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorted array are:");
		for(i=0;i<n;i++) {
			System.out.print("\t"+a[i]);
		}
	}
	
	public static void main(String[] args) {
		// 78312
		//87321
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n=sc.nextInt();
		System.out.println("Enter the array elements:");
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Sort(n,a);

	}

}
