package logic;

import java.util.Scanner;

public class Reverse_Triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row number:");
		int n=sc.nextInt();
		printReverseTriangle(n);
	}
	public static void printReverseTriangle(int n) {
		int i,j;
		int space=0;
		int star=n;
		for(i=0;i<n;i++) {
			for(j=0;j<space;j++) {
				System.out.print(" ");
				
			}
			for(j=0;j<star;j++) {
				System.out.print("*");
			}
			space++;
			star--;
			System.out.println();
		}
	}

}
