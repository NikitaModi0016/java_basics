package sort.java;
import java.util.Scanner;
public class Insertion_Sort {

	public static void Sort(int n, int a[]) {
		int temp,j;
		for(int i=1;i<n;i++) {
			temp=a[i];
			j=i-1;
			while(j>=0&&a[j]>temp) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		System.out.println("Sorted array are:");
		for(int i=0;i<n;i++) {
			System.out.print("\t"+a[i]);
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
