package logic;
import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the row:");
		int r=sc.nextInt();
		printPattern2(r);
	}
public static void printPattern2(int n) {
	
	int i,j;
	for(i=1;i<=n;i++) {
		for(j=1;j<=n;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
