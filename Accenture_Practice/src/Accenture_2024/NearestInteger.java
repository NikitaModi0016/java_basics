package Accenture_2024;
import java.util.Scanner;
public class NearestInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an arrys:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter three element:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
		nearestInteger(n,arr);
	}
	public static void nearestInteger(int n, int arr[]) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
	}

}
