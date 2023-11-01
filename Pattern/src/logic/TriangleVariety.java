package logic;

import java.util.Scanner;

public class TriangleVariety {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row number:");
		int n=sc.nextInt();
		printTriangle(n);
	}
	public static void printTriangle(int n) {
		for(int i=1;i<=n*2-1;i++) {
			int star=i>n? 2*n-i : i;
			//print space first
			int space=n-star;
			for(int k=1;k<=space;k++) {
				System.out.print(" ");
			}
			//then print star
			
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
