package logic;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row number:");
		int n=sc.nextInt();
		printTriangle(n);
	}
	public static void printTriangle(int n) {
		for(int i=1;i<=n;i++) {
			//print space first
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			//then print star
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
