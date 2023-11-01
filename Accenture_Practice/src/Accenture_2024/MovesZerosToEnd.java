package Accenture_2024;
import java.util.Scanner;
public class MovesZerosToEnd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the size of an array:");
		int n=sc.nextInt();
		System.out.println("Enter the elements:");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		MoveZero(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void MoveZero(int arr[]) {
		int i,j,temp,start=0;
		for(i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				for(j=i;j>start;j--) {
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				start++;
			}
		}    }
}