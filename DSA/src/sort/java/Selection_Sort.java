package sort.java;

import java.util.Scanner;

public class Selection_Sort {
	public static void Sort(int n, int a[]) {
		
		
		
		System.out.println("Sorted array are:");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+"\t");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Sort(n,a);

	}

}
